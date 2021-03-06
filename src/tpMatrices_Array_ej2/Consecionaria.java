package tpMatrices_Array_ej2;

public class Consecionaria {
	private static Vehiculo[] vehiculos;

	public static void main(String[] args) {
		vehiculos = new Vehiculo[20];
		agregarVehÝculo("JLU068", 300000, TipoVehiculo.SEDAN);
		agregarVehÝculo("ABC068", 500000, TipoVehiculo.SEDAN);
		agregarVehÝculo("BAC321", 700000, TipoVehiculo.SEDAN);
		agregarVehÝculo("AFR567", 1000000, TipoVehiculo.PICK_UP);
		agregarVehÝculo("AFD567", 1500000, TipoVehiculo.PICK_UP);
		agregarVehÝculo("JEF857", 850000, TipoVehiculo.UTILITARIO);
		agregarVehÝculo("AFR569", 1000000, TipoVehiculo.UTILITARIO);
		agregarVehÝculo("LPO068", 100000, TipoVehiculo.SEDAN);
		agregarVehÝculo("LDU068", 150000, TipoVehiculo.SEDAN);
		agregarVehÝculo("CAC331", 7000000, TipoVehiculo.SEDAN);
		agregarVehÝculo("DFG547", 1100000, TipoVehiculo.PICK_UP);
		agregarVehÝculo("QWE577", 1350000, TipoVehiculo.PICK_UP);
		agregarVehÝculo("QWE577", 1350000, TipoVehiculo.PICK_UP);
		agregarVehÝculo("ZXC867", 900000, TipoVehiculo.UTILITARIO);
		agregarVehÝculo("GTY567", 990000, TipoVehiculo.UTILITARIO);
		agregarVehÝculo("GTO567", 990000, TipoVehiculo.UTILITARIO);
		agregarVehÝculo("GTY547", 990000, TipoVehiculo.UTILITARIO);
		agregarVehÝculo("GTY267", 990000, TipoVehiculo.UTILITARIO);
		agregarVehÝculo("GTY557", 990000, TipoVehiculo.UTILITARIO);
		agregarVehÝculo("GTO123", 990000, TipoVehiculo.UTILITARIO);
		agregarVehÝculo("GWY567", 990000, TipoVehiculo.UTILITARIO);
		
		
		agregarVehÝculo("GSY567", 990000, TipoVehiculo.UTILITARIO);
		
	

		vender(vehiculos[1]);
		
		
	}

	
	public static void vender(Vehiculo vehiculo) {
		double costo;
		int posVehiculo;
		if(vehiculo != null) {
			posVehiculo = buscarVehiculo(vehiculo.getPatente());
			costo = calcularCosto(vehiculo);
			System.out.println(vehiculo.toString());
			System.out.println("El costo final es de $" +costo);
			vehiculos[posVehiculo] = null;
			
		} else {
			System.out.println("No se encontrˇ el vehÝculo.");
		}
	}
	
	private static double calcularCosto(Vehiculo vehiculo) {
		int IVA_MAX = 20;
		int IVA_MIN = 16;
		int IMP_RODAMIENTO = 5;
		int DESC_COMERCIAL = 5;
		double CORTE_DESC = 400000;
		double CORTE_MAX_IVA = 800000;
		double CORTE_RODAMIENTO = 1000000;
		double iva;
		double costo = 0;
		if (vehiculo.getPrecio() > CORTE_MAX_IVA) {
			iva = vehiculo.getPrecio()*IVA_MAX/100;
			costo = vehiculo.getPrecio() + iva;
		} else {
			iva = vehiculo.getPrecio()*IVA_MIN/100;
			costo = vehiculo.getPrecio() + iva;
		}

		if (vehiculo.getPrecio() <= CORTE_DESC && vehiculo.getTipo() == TipoVehiculo.SEDAN) {
			costo = costo - (iva/2);
		} else if (vehiculo.getPrecio() > CORTE_RODAMIENTO) {
			if (vehiculo.getTipo() == TipoVehiculo.PICK_UP || vehiculo.getTipo() == TipoVehiculo.UTILITARIO) {
				costo = costo + (vehiculo.getPrecio()*IMP_RODAMIENTO/100);
			}
		}
		if (costo < CORTE_DESC) {
			costo = costo - (vehiculo.getPrecio()*DESC_COMERCIAL/100);
		}
		
		return costo;
	}
	
	public static boolean agregarVehÝculo(String patente, double precio, TipoVehiculo tipo) {
		boolean agregado = false;
		int posLibre = hayLugarLibre();
		if (posLibre != -1) {
			if (buscarVehiculo(patente) == -1) {
				vehiculos[posLibre] = new Vehiculo(patente, precio, tipo);
				agregado = true;
			} else {
				System.out.println("El vehÝculo patente '" +patente+ "' ya existe en la consecionaria.");
			}
		} else {
			System.out.println("No hay lugar en la consecionaria.");
		}
		
		return agregado;
	}
	
	private static int hayLugarLibre() {
		int hayLugar = -1;
		int i = 0;
		while (hayLugar == -1 && i<vehiculos.length) {
			if (vehiculos[i] == null) {
				hayLugar = i;
			} else {
				i++;
			}
		}
		return hayLugar;
	}
	
	private static int buscarVehiculo(String patente) {
		int posVehiculo = -1;
		int i = 0;
		while (posVehiculo == -1 && i<vehiculos.length) {
			if (vehiculos[i] != null && vehiculos[i].getPatente().matches(patente)) {
				posVehiculo = i;
			} else {
				i++;
			}
		}
		return posVehiculo;
	}
}

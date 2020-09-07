package ej6_Unidad1;

public class Rubro {
	private int TOTAL_MESES = 12;
	private String nombre;
	private double[] gastosPorMes;
	
	public Rubro(String nombre) {
		setNombre(nombre);
		inicializarGastos();
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void inicializarGastos() {
		this.gastosPorMes = new double[TOTAL_MESES];
	}
	
	public void agregarGasto(Mes mes, double importe) {
		if(importe > 0) {
			int posicionMes;
			posicionMes = buscarMes(mes);
			gastosPorMes[posicionMes] = gastosPorMes[posicionMes] + importe;	
		} else {
			System.out.println("Debe ingresarse un importe mayor a 0.");
		}
	}
		
	public String getNombre() {
		return this.nombre;
	}
	
	public double getGastos(Mes mes) {
		int posicionMes;
		posicionMes = buscarMes(mes);
		return this.gastosPorMes[posicionMes];
	}
	
	private int buscarMes(Mes mes) {
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i<TOTAL_MESES) {
			if (mes == Mes.values()[i]) {
				encontrado = true;
			}
		}
		return i;
	}
}

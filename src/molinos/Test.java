package molinos;

public class Test {

	public static void main(String[] args) {
		EmpresaAgricola molinos = new EmpresaAgricola("Molinos", 6);
		
		molinos.agregarCosecha(new Cosecha("Trigo", "1", "20170101", 20, 200, 78));
		molinos.agregarCosecha(new Cosecha("Trigo", "1", "20170801", 19, 194, 85));
		molinos.agregarCosecha(new Cosecha("Maiz", "2", "20170901", 25, 262, 85));
		molinos.agregarCosecha(new Cosecha("Maiz", "2", "20171201", 12, 140, 64));
		molinos.agregarCosecha(new Cosecha("Soja", "3", "20180101", 26, 217, 93));
		molinos.agregarCosecha(new Cosecha("Soja", "3", "20180201", 34, 261, 91));
		
		molinos.cargarResultados();
		molinos.mostrarResultados();
		
		System.out.println(molinos.buscarCosecha(3));
		
		System.out.println(molinos.obtenerCosechaConMasKilos());
		System.out.println(molinos.obtenerCosechaConMasAltura());
	}

}

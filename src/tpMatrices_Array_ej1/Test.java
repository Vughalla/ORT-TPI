package tpMatrices_Array_ej1;

public class Test {

	public static void main(String[] args) {
		TestVec test = new TestVec();
		
		test.mostrarMayorNumero();
		
		if(test.estaElPromedio()) {
			System.out.println("El promedio está en el array.");
		} else {
			System.out.println("El promedio NO está en el array.");
		}
		
		test.reacomodar();
		
	}

}

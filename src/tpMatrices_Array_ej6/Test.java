package tpMatrices_Array_ej6;

public class Test {

	public static void main(String[] args) {
		int[][] cubo = new int[3][3];
		int[][] cubo2 = new int[3][3];
		int[] numeros = {6,1,8,7,5,3,2,9,4};
		int[] numeros2 = {0,6,7,8,5,2,1,4,3};
		
		cargarMatriz(cubo, numeros);
		cargarMatriz(cubo2, numeros2);
		
		mostrarMatriz(cubo);
		System.out.println(esMagico(cubo));
		
		mostrarMatriz(cubo2);
		System.out.println(esMagico(cubo2));
		
	}

	
	private static boolean esMagico(int[][] matriz) {
		boolean esMagico = false;
		if (sumaDiagonal(matriz) == sumaDiagonalInversa(matriz)) {
			if (sumaFilas(matriz, sumaDiagonal(matriz)) == sumaDiagonal(matriz)){
				if (sumaColumnas(matriz, sumaDiagonal(matriz)) == sumaDiagonal(matriz)){
					esMagico = true;
				}
			}	
		}
		return esMagico;
	}
	
	private static int sumaColumnas(int[][] matriz, int sumaDiagonales) {
		int suma = sumaDiagonales;
		for (int j=0; j<3; j++) {
			if(sumaDiagonales == suma) {
				suma = 0;
				for (int i=0; i<matriz.length; i++) {
					suma = suma + matriz[i][j];	
				}
			}
		}
		
		return suma;
	}
	
	
	private static int sumaFilas(int[][] matriz, int sumaDiagonales) {
		int suma = sumaDiagonales;
		for (int i=0; i<matriz.length; i++) {
			if(sumaDiagonales == suma) {
				suma = 0;
				for (int j=0; j<matriz[i].length; j++) {
					suma = suma + matriz[i][j];	
				}
			}
		}
		
		return suma;
	}
	
	
	private static int sumaDiagonal(int[][] matriz) {
		int suma = 0;
		int posASumar = 0;
		
		for (int i=0; i<matriz.length; i++) {
			suma = suma + matriz[i][posASumar];
			posASumar = posASumar + 1;
		}
		return suma;
	}
	
	private static int sumaDiagonalInversa(int[][] matriz) {
		int suma = 0;
		int posASumar = matriz.length-1;
		
		for (int i=0; i<matriz.length; i++) {
			suma = suma + matriz[i][posASumar];
			posASumar = posASumar - 1;
		}
		return suma;
	}
	
	
	private static void cargarMatriz(int[][] matriz, int[] numeros) {
		int k = 0;
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = numeros[k];
				k++;
			}
		}
	}
	
	private static void mostrarMatriz(int[][] matriz) {
		for (int i=0; i<matriz.length; i++) {
			System.out.println(" ");
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
		}
		System.out.println(" ");
	}
}

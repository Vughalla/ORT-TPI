package tpMatrices_Array_ej5;

public class Test {
	
	public static void main(String[] args) {
		int[][] matriz = new int[6][6];
		cargarMatriz(matriz);
		mostrarMatriz(matriz);
		
		System.out.println("La suma de la diagonal princila es " +devolverSuma(matriz));
		
	}
	
	private static int devolverSuma(int[][] matriz) {
		int suma = 0;
		int posASumar = matriz.length-1;
		
		for (int i=0; i<matriz.length; i++) {
			suma = suma + matriz[i][posASumar];
			posASumar = posASumar - 1;
		}
		return suma;
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
	
	private static void cargarMatriz(int[][] matriz) {
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = obtenerIntRandom(100);
			}
		}
	}
	
	private static int obtenerIntRandom(int numero) {
		int random;	
	    random = (int)(Math.random() * numero + 1);
	    return random;
	}
}

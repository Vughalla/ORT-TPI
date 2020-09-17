package tpMatrices_Array_ej7;

public class Test {

	public static void main(String[] args) {
		int[][] matriz = new int[2][3];
		cargarMatriz(matriz);
		mostrarMatriz(matriz);
		transponer(matriz);
		
	}
	
	private static int[][] transponer(int[][] matriz){
		int[][] trans = new int[matriz[0].length][matriz.length];
		for(int i=0; i<trans.length; i++) {
			for(int j=0; j<trans[i].length; j++) {
				trans[i][j] = matriz[j][i];
			}
		}
		
		mostrarMatriz(trans);
		return trans;
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

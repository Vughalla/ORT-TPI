package tpMatrices_Array_ej3;

public class Test {
	private static int[][] matriz;
	private static int FILAS = 6;
	private static int COLUMNAS = 4;
	
	public static void main(String[] args) {
		matriz = new int[FILAS][COLUMNAS];
		int[] menosUno = new int[matriz.length];
		
		cargarMatriz();
		mostrarMatriz();
		posMenorValor();
		System.out.println("------------------------");
		buscarImpares();
		mostrarMatriz();
		System.out.println("------------------------");
		menosUno = contarMenosUno(matriz);
		
		for (int i=0; i<menosUno.length; i++) {
			System.out.println(menosUno[i]);
		}
		
		if (posNeg()) {
			System.out.println("Hay más positivos en las filas que negativos en columnas.");
		} else {
			System.out.println("Hay más negativos en las columnas que positivos en filas.");
		}
		
		System.out.println("------------------------");
		mostrarMatriz();
		intercambiar(3,5);
		System.out.println("------------------------");
		mostrarMatriz();
	}
	
	private static void intercambiar(int pos1, int pos2) {
		int[] temp = new int[FILAS];
		
		if(pos1 >= 0 && pos1<=FILAS && pos1 != pos2) {
			if(pos2 >= 0 && pos2<=FILAS) {
				for(int i=0; i<matriz[pos1].length; i++) {
					temp[i] = matriz[pos1][i];
					matriz[pos1][i] = matriz[pos2][i];
					matriz[pos2][i] = temp[i];
				}
			}
		}
	}
	
	
	private static boolean posNeg() {
		boolean masPositivos = false;
		System.out.println("------------");
		System.out.println(positivosFilas());
		System.out.println(negColumnas());
		
		if (positivosFilas() > negColumnas()) {
			masPositivos = true;
		}
		return masPositivos;
	}

	private static int negColumnas() {
		int acum = 0;
		for (int j=0; j<COLUMNAS; j++) {
			for(int i=0; i<FILAS; i++) {
				if(matriz[i][j] < 0) {
					acum = acum +1;
				}
			}
		}
		return acum;
	}
	
	
	private static int positivosFilas() {
		int acum = 0;
		for (int i=0; i<FILAS; i++) {
			for(int j=0; j<COLUMNAS; j++) {
				if(matriz[i][j] > 0) {
					acum = acum +1;
				}
			}
		}
		return acum;
	}
	
	private static void posMenorValor() {
		int posFila = 0;
		int posColumna= 0;
		int menor = matriz[0][0];
		
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] < menor) {
					menor = matriz[i][j];
					posFila = i;
					posColumna = j;
				}
			}
		}
		System.out.println("El menor valor está en ["+posFila+"]["+posColumna+"]");
	}
	
	private static void mostrarMatriz() {
		for (int i=0; i<matriz.length; i++) {
			System.out.println(" ");
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
		}
		System.out.println(" ");
	}
	
	private static int[] contarMenosUno(int[][] matriz) {
		int[] menosUno = new int[matriz.length];
		
		for (int i=0; i<matriz.length; i++) {
			int acum = 0;
			for(int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j] == -1) {
					acum = acum +1;
				}
			}
			menosUno[i] = acum;
		}
		return menosUno;
	}
	
	
	private static void buscarImpares() {
		int acum = 0;
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j]%2 != 0) {
					acum = acum +1;
					matriz[i][j] = -1;
				}
			}
		}
		System.out.println("Hay "+acum+ " impares.");
	}
	
	private static void cargarMatriz() {
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

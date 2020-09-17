package tpMatrices_Array_ej1;

import java.util.Arrays;

public class TestVec {
	private int CANT_ELEMENTOS=30;
	private int[] array;

	public TestVec() {
		inicializarVector();
	}
	
	private int obtenerIntRandom(int numero) {
		int random;	
	    random = (int)(Math.random() * numero + 1);
	    return random;
	}
	
	private void inicializarVector() {
		array = new int[CANT_ELEMENTOS];
		for (int i=0; i<array.length; i++) {
			array[i] = obtenerIntRandom(CANT_ELEMENTOS);
		}
	}
	
	public int[] getVect() {
		return this.array;
	}
	
	public void mostrarMayorNumero() {
		System.out.println(toString());
		int[] arrayOrdenado = new int[this.array.length];
		arrayOrdenado = this.array;
		ordenarArray(arrayOrdenado);
		imprimirMax(arrayOrdenado);
	}
	
	private void ordenarArray(int[] arrayOrdenado) {
		for (int i=arrayOrdenado.length-1; i>0; i--) {
			for (int j=0; j<i; j++) {
				if (arrayOrdenado[j] > arrayOrdenado[j + 1]) {
					intercambiar(arrayOrdenado, j, j+1);
				}
			}
		}
	}

	private void intercambiar(int[] arrayOrdenado, int a, int b) {
		int temp = arrayOrdenado[b];
		arrayOrdenado[b] = arrayOrdenado[a];
		arrayOrdenado[a] = temp;
	}

	
	private void imprimirMax(int[] arrayOrdenado) {
		int mayor;
		int i;
		int contador = 0;
		mayor = arrayOrdenado[arrayOrdenado.length-1];
		i = arrayOrdenado.length-1;
		while (mayor == arrayOrdenado[i] && i>0) {
			contador = contador + 1;
			i--;
		}
		System.out.println("El mayor número es "+mayor+". Cantidad de repeticiones: " +contador+ ".");
	}

	public boolean estaElPromedio() {
		boolean promPresente = false;
		double promedio = sacarPromedio();
		int i = 0;
		while (promPresente == false && i<this.array.length) {
			if(promedio == array[i]) {
				promPresente = true;
			} else {
				i++;
			}
		}
		return promPresente;
	}
	
	private double sacarPromedio() {
		int acum = 0;
		double promedio = 0;
		for (int i=0; i<this.array.length; i++) {
			acum = acum + array[i];
		}
		promedio = (double)acum/array.length;
		System.out.println("El promedio es "+promedio);
		return promedio;
	}
	
	public void reacomodar() {
		int primer = this.array[array.length-1];
		int[] arrOrdenado = new int[this.array.length];
		arrOrdenado = this.array;
		
		for (int i=arrOrdenado.length-1; i>0; i--) {
			arrOrdenado[i] = arrOrdenado[i-1];
		}
		arrOrdenado[0] = primer;
		mostrarArray(arrOrdenado);
	}
	
	
	@Override
	public String toString() {
		return "TestVec [array=" + Arrays.toString(array) + "]";
	}
	
	public void mostrarArray(int[] arrayOrdenado) {
		System.out.println("TestVec [arr2=" + Arrays.toString(arrayOrdenado) + "]");
	}
	
}

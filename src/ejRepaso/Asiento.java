package ejRepaso;
import java.util.ArrayList;

public class Asiento {
	private int fila;
	private char letra;
	private Estado estado;
	private int ASIENTOMIN = 1;
	private int ASIENTOMAX = 20;
	private char LETRAMIN = 'a';
	private char LETRAMAX = 'k';
	
	/**
	 * Constructor de la clase Asiento.
	 * @param fila
	 * @param letra
	 */
	public Asiento(int fila, char letra) {
		setFila(fila);
		setLetra(letra);
		setEstado(Estado.LIBRE);
		
	}
	
	/**
	 * Setter del atributo fila de la clase Asiento.
	 * @param fila
	 */
	private void setFila(int fila) {
		if(fila >= ASIENTOMIN && fila <= ASIENTOMAX){
			this.fila = fila;	
		} else {
			System.out.println("Se superaron los valores de fila permitidos");
		}
	}

	/**
	 * Setter del atributo letra de la clase Asiento.
	 * @param letra
	 */
	private void setLetra(char letra) {
		if (letra < LETRAMIN && letra > LETRAMAX) {
			this.letra = letra;	
		} else {
			System.out.println("Se superaron los valores de letra permitidos");
		}
		
	}

	/**
	 * Setter del atributo estado de la clase Asiento.
	 * @param estado
	 */
	private void setEstado(Estado estado) {
		this.estado = estado;
	}


}

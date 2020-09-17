package ejRepaso;
import java.util.ArrayList;

public class Asiento {
	private int fila;
	private char letra;
	private Estado estado;
	

	public Asiento(char letra, int fila) {
		setFila(fila);
		setLetra(letra);
		setEstado(Estado.LIBRE);
	}

	private void setFila(int fila) {
		this.fila = fila;	
	}

	private void setLetra(char letra) {
		this.letra = letra;	
	}

	private void setEstado(Estado estado) {
		this.estado = estado;
	}
}

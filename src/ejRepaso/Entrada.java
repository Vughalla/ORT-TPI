package ejRepaso;

public class Entrada {
	private String dia;
	private String horaInicio;
	private int fila;
	private char letra;
	
	public Entrada(String dia, String horaInicio, char fila, char letra) {
		setDia(dia);
		setHoraInicio(horaInicio);
		setFila(fila);
		setLetra(letra);
	}

	private void setDia(String dia) {
		this.dia = dia;
	}

	private void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	private void setFila(int fila) {
		this.fila = fila;
	}

	private void setLetra(char letra) {
		this.letra = letra;
	}

	public String getDia() {
		return dia;
	}

	public String getHoraInicio() {
		return horaInicio;
	}
	
}

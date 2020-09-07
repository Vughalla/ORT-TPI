package ejRepaso;
import java.util.ArrayList;

public class Funcion {
	private String dia;
	private String horaInicio;
	private ArrayList<Asiento> asientos;
	
	/**
	 * Constructor de la clase Funcion.
	 * @param dia
	 * @param horaInicio
	 */
	public Funcion(String dia, String horaInicio) {
		setDia(dia);
		setHoraInicio(horaInicio);
		asientos = new ArrayList<Asiento>();
		crearAsientos(asientos);
	}

	/**
	 * Setter del atributo dia de la clase Funcion.
	 * @param dia
	 */
	private void setDia(String dia) {
		this.dia = dia;
	}

	/**
	 * Setter del atributo horaInicio de la clase Funcion.
	 * @param horaInicio
	 */
	private void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	private void crearAsientos(ArrayList<Asiento> asientos) {
		for(char letra='a'; letra<='k'; letra++) {
			for (int i=1; i<=20; i++) {
				Asiento asiento = new Asiento(i,letra);
				asientos.add(asiento);
			}
		}
	}

	public String getDia() {
		return dia;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

}

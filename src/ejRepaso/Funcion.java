package ejRepaso;


public class Funcion {
	private String dia;
	private String horaInicio;
	private Asiento asientos[][];
	
	/**
	 * Constructor de la clase Funcion.
	 * @param dia
	 * @param horaInicio
	 */
	public Funcion(String dia, String horaInicio) {
		setDia(dia);
		setHoraInicio(horaInicio);
		crearAsientos();
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

	private void crearAsientos() {
		for(char letra='a'; letra<='k'; letra++) {
			for (int i=0; i<=19; i++) {
				asientos[0][0] = new Asiento(letra,i);
				
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

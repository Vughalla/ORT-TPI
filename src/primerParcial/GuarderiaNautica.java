package primerParcial;

public class GuarderiaNautica {

	private static final int CANT_NIVELES = 2;
	private static final int CAMAS_X_NIVEL = 4;
	private Fecha fechaDeHoy;
	// private ... embarcaciones; // Completar
	private Embarcacion[][] embarcaciones;
	private int primerNivelConLugar;
	private int primeraCamaLibre;

	/**
	 * Constructor.
	 * 
	 * @param fecha
	 *            Recibe la fecha del dia
	 */
	public GuarderiaNautica(Fecha fecha) {
		// TODO Implemetar el constructor.
		embarcaciones = new Embarcacion[CANT_NIVELES][CAMAS_X_NIVEL];
		setPrimerNivelConLugar(0);
		setPrimeraCamaLibre(0);
		setFechaDeHoy(fecha);
	}

	/**
	 * Metodo privado que debe devolver la embarcacion con la misma patente
	 * recibida por parametro, o null.
	 * 
	 * @param patente
	 *            La patente de la embarcacion buscada.
	 * @return La embarcacion o null.
	 */
	private Embarcacion obtenerEmbarcacionPorPatente(String patente) {
		// TODO completar
		Embarcacion embarcacion = null;
		int i = 0;
		int j = 0;
		while (embarcacion == null && i<embarcaciones.length) {
			while (embarcacion == null && j<embarcaciones[i].length) {
				if (embarcaciones[i][j] != null) {
					if (embarcaciones[i][j].getPatente().matches(patente)) {
						embarcacion = embarcaciones[i][j];
					} else {
						j++;
					}	
				}
			}
			i++;
		}
		return embarcacion;
	}

	/**
	 * Muestra los datos de cada embarcacion (patente, nro de cama asignada y
	 * fecha de ingreso) mas la cantidad de cuotas adeudadas. Ademas debe
	 * mostrar el porcentaje de clientes al díia en relacion al total de
	 * clientes.
	 */
	public void mostrarCuotasAdeudadas() {
		// TODO
		int cantClientes = 0;
		int deudores = 0;
		double porcentaje;
		System.out.println("*** Detalle de la recaudacion Anual ***");
		for (int i=0; i<embarcaciones.length; i++) {
			for (int j=0; j<embarcaciones[i].length; j++) {
				if (embarcaciones[i][j] != null) {
					System.out.println("Embarcacion patente " +embarcaciones[i][j].getPatente()+ "\t Cama Nro: " +embarcaciones[i][j].getCamaAsignada()+ "\t Ingreso: " +embarcaciones[i][j].getFechaDeIngreso()+ "\t  Cuotas adeudadas: "+embarcaciones[i][j].cuotasAdeudadas(this.fechaDeHoy));
					cantClientes = cantClientes +1;
					if (embarcaciones[i][j].cuotasAdeudadas(this.fechaDeHoy) > 0) {
						deudores = deudores + 1;	
					}
				}
			}
		}
		porcentaje = deudores*100/cantClientes;
		System.out.println("Porcentaje de clientes al dia: "+porcentaje);
	}

	public void pagarCuota(String patente, String cbu, int importe) {
		Embarcacion embarcacion = obtenerEmbarcacionPorPatente(patente);
		if (embarcacion != null) {
			if (!embarcacion.estaAlDia(fechaDeHoy)) {
				embarcacion.registrarPago(fechaDeHoy, cbu, importe);
			}
		}
	}

	public void registrarEmbarcacion(String patente, Fecha fecha) {
		if (primerNivelConLugar < CANT_NIVELES) {
			embarcaciones[primerNivelConLugar][primeraCamaLibre] = new Embarcacion(patente, fecha,
					(primerNivelConLugar + 1) * 10 + primeraCamaLibre + 1);
			primeraCamaLibre++;
			if (primeraCamaLibre == CAMAS_X_NIVEL) {
				primerNivelConLugar++;
				primeraCamaLibre = 0;
			}
		}
	}
	
	private void setPrimerNivelConLugar(int nivel) {
		this.primerNivelConLugar = nivel;
	}
	
	private void setPrimeraCamaLibre(int cama) {
		this.primeraCamaLibre = cama;
	}
	
	private void setFechaDeHoy(Fecha fecha) {
		this.fechaDeHoy = fecha;
	}

}
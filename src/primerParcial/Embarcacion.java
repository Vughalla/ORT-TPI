package primerParcial;

public class Embarcacion {

	private static final int TOTAL_MESES = 12;
	private String patente;
	private Fecha fechaDeIngreso;
	private int camaAsignada;
	private Pago[] pagos;

	public Embarcacion(String patente, Fecha fechaDeIngreso, int camaAsignada) {
		setCamaAsignada(camaAsignada);
		setPatente(patente);
		setFechaDeIngreso(fechaDeIngreso);
		pagos = new Pago[TOTAL_MESES];
	}

	/**
	 * Indica si los pagos de la embarcacion estan al día. Debe resolverse de la
	 * forma mas eficiente posible. .
	 * 
	 * @param fechaActual
	 *            La fecha del dia.
	 * @return Un booleano que indica si esta al dia.
	 */
	public boolean estaAlDia(Fecha fechaActual) {
		// TODO Resolver
		boolean alDia = true;
		int inicio = 0;
		if (this.fechaDeIngreso.getAnio() == fechaActual.getAnio()) {
			inicio = fechaDeIngreso.getMes()-1;
		}
		
		for (int i=inicio; i<fechaActual.getMes()-1; i++) {
			if(pagos[i] == null) {
				alDia = false;
			}
		}
		return alDia;
	}

	/**
	 * Devuelve el número de cuotas adeudadas por esta embarcación.
	 * 
	 * @param fechaActual
	 *            La fecha del dia.
	 * @return La cantidad de cuotas adeudadas
	 */
	public int cuotasAdeudadas(Fecha fechaActual) {
		// TODO resolver
		int cuotas = 0;
		int inicio = 0;
		if (this.fechaDeIngreso.getAnio() == fechaActual.getAnio()) {
			inicio = fechaDeIngreso.getMes()-2;
		}
			
		for (int i=inicio; i<fechaActual.getMes()-1; i++) {
			if(pagos[i] == null) {
				cuotas = cuotas +1;
			}
		}
		
		return cuotas;
	}

	public int getCamaAsignada() {
		return camaAsignada;
	}

	public Fecha getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	private int getMesInicial(Fecha fechaActual) {
		return (fechaActual.getAnio() == fechaDeIngreso.getAnio()) ? fechaDeIngreso.getMes() : 1;
	}

	public String getPatente() {
		return this.patente;
	}

	public boolean patenteBuscada(String patente) {
		return this.patente.equalsIgnoreCase(patente);
	}

	private int primerMesImpago(Fecha fechaActual) {
		int m = getMesInicial(fechaActual);
		int mActual = fechaActual.getMes();
		while (m <= mActual && pagos[m - 1] != null) {
			m++;
		}
		return m;
	}

	public void registrarPago(Fecha fechaDeHoy, String cbu, int importe) {
		int mes = primerMesImpago(fechaDeHoy);
		pagos[mes - 1] = new Pago(fechaDeHoy, cbu, importe);
	}

	public void setCamaAsignada(int camaAsignada) {
		this.camaAsignada = camaAsignada;
	}

	public void setFechaDeIngreso(Fecha fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	private void setPatente(String patente) {
		this.patente = patente;
	}

	@Override
	public String toString() {
		return "Embarcacion [patente=" + patente + ", fechaDeIngreso=" + fechaDeIngreso + ", camaAsignada="
				+ camaAsignada + "]";
	}

}
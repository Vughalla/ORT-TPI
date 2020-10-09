package primerParcial;

public class Pago {
	private Fecha fechaDePago;
	private String cbuPagador;
	private double monto;
	
	public Pago(Fecha fechaDePago, String cbuPagador, double monto) {
		this.setFechaDePago(fechaDePago);
		this.setCbuPagador(cbuPagador);
		this.setMonto(monto);
	}

	private void setFechaDePago(Fecha fechaDePago) {
		this.fechaDePago = fechaDePago;
	}

	public String getCbuPagador() {
		return cbuPagador;
	}

	public double getMonto() {
		return monto;
	}

	private void setCbuPagador(String cbuPagador) {
		this.cbuPagador = cbuPagador;
	}

	private void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Pago [fechaDePago=" + fechaDePago + ", cbuPagador=" + cbuPagador + ", monto=" + monto + "]";
	}

}

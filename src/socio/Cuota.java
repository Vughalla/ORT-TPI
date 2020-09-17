package socio;

public class Cuota {
	@SuppressWarnings("unused")
	private double valorCuota;
	private double cuotaAdeudada;
	
	public Cuota(double valorCuota) {
		setValorCuota(valorCuota);
		setCuotaAdeudada(valorCuota);
	}
	
	private void setValorCuota(double valorCuota) {
		this.valorCuota = valorCuota;
	}
	
	private void setCuotaAdeudada(double valorCuota) {
		this.cuotaAdeudada = valorCuota;
	}
	
	public double getCuotaAdeudada() {
		return this.cuotaAdeudada;
	}
	
	public void pagarCuota(double importe) {
		setCuotaAdeudada(getCuotaAdeudada()-importe);
	}
}

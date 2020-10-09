package banco;

public class CajaAhorro extends ProductoBancario {
	private double montoMinPrimerDeposito;
	private boolean PRIMERDEPOSITO = true;
	
	public CajaAhorro(String id, String cliente, double tasaInteres, double montoMinPrimerDeposito) {
		super(id, cliente, tasaInteres);
		setMontoMinPrimerDeposito(montoMinPrimerDeposito);
	}
	
	@Override
	public void depositar(double monto) {
		if (this.validarMonto(monto)) {
			if (PRIMERDEPOSITO) {
				if (monto >= montoMinPrimerDeposito) {
					this.setSaldo(this.getSaldo() + monto);
					PRIMERDEPOSITO = false;
				} else {
					this.setSaldo(this.getSaldo() + monto);
				}
			}	
		} else {
			System.out.println("Ingrese un monto mayor a 0.");
		}
	}
	
	@Override
	public double retirar(double monto) {
		double retira = 0;
		double montoDisponible = this.getSaldo();
		
		if (this.validarMonto(monto)) {
			if (monto < montoDisponible) {
				retira = monto;
				this.setSaldo(montoDisponible - monto);
			} else {
				retira = montoDisponible;
				this.setSaldo(0);
			}	
		} else {
			System.out.println("Ingrese un monto mayor a 0.");
		}
		return retira;
	}
	
	
	private void setMontoMinPrimerDeposito(double montoMinPrimerDeposito) {
		this.montoMinPrimerDeposito = montoMinPrimerDeposito;
	}
}

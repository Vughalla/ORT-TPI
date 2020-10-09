package banco;

public class TarjetaCredito extends ProductoBancario {
	private double limDeCred;
	
	public TarjetaCredito(String id, String cliente, double tasaInteres, double limDeCred) {
		super(id, cliente, tasaInteres);
		setLimDeCred(limDeCred);
	}
	
	@Override
	public void depositar(double monto) {
		if (this.validarMonto(monto)) {
			this.setSaldo(this.getSaldo() + monto);	
		} else {
			System.out.println("Ingrese un monto mayor a 0.");
		}
	}
	
	@Override
	public double retirar(double monto) {
		double retira = 0;
		double montoDisponible = this.getLimDeCred();
		
		if (this.validarMonto(monto)) {
			if (monto < montoDisponible) {
				retira = monto;
				this.setLimDeCred(montoDisponible - monto);
			} else {
				retira = montoDisponible;
				this.setLimDeCred(0);
			}	
		} else {
			System.out.println("Ingrese un monto mayor a 0.");
		}
		return retira;
	}
	
	private void setLimDeCred(double limDeCred) {
		this.limDeCred = limDeCred;
	}
	
	public double getLimDeCred() {
		return this.limDeCred;
	}
}

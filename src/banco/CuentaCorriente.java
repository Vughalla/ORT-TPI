package banco;

public class CuentaCorriente extends ProductoBancario {
	private double limDescubierto;
	
	public CuentaCorriente(String id, String cliente, double tasaInteres, double limDescubierto) {
		super(id, cliente, tasaInteres);
		setLimDescubierto(limDescubierto);
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
		double montoDisponible = this.getSaldo();
		double totalDisponible = montoDisponible + getLimDescubierto();
		
		if (this.validarMonto(monto)) {
			if (monto < totalDisponible) {
				if (monto < montoDisponible) {
					this.setSaldo(montoDisponible - monto);
				} else if (monto == montoDisponible) {
					this.setSaldo(0);
				} else if (monto < totalDisponible) {
					this.setSaldo(0);
					this.setLimDescubierto(monto - totalDisponible);
				}
				retira = monto;
			} else {
				this.setSaldo(0);
				this.setLimDescubierto(0);
				retira = totalDisponible;
			}	
		} else {
			System.out.println("Ingrese un monto mayor a 0.");
		}
		return retira;
	}
	
	private void setLimDescubierto(double limDescubierto) {
		this.limDescubierto = limDescubierto;
	}
	
	public double getLimDescubierto() {
		return this.limDescubierto;
	}
}

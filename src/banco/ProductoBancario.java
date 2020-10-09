package banco;

public abstract class ProductoBancario {
	private String id;
	private String cliente;
	private double saldo;
	private double tasaInteres;
	
	public ProductoBancario(String id, String cliente, double tasaInteres) {
		setId(id);
		setCliente(cliente);
		setSaldo(0);
		setTasaInteres(tasaInteres);
	}
	
	protected abstract void depositar(double monto);
	
	protected abstract double retirar(double monto);
	
	protected boolean validarMonto(double monto) {
		boolean valido = false;
		if (monto > 0) {
			valido = true;
		}
		return valido;
	}
	
	protected void setId(String id) {
		this.id = id;
	}

	protected void setCliente(String cliente) {
		this.cliente = cliente;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
	
	protected double getSaldo() {
		return this.saldo;
	}

	@Override
	public String toString() {
		return "ProductoBancario [id=" + id + ", cliente=" + cliente + ", saldo=" + saldo + ", tasaInteres="
				+ tasaInteres + "]";
	}
}

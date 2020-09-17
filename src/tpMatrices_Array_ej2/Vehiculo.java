package tpMatrices_Array_ej2;

public class Vehiculo {
	private String patente;
	private double precio;
	private TipoVehiculo tipo;

	Vehiculo(String patente, double precio, TipoVehiculo tipo){
		setPatente(patente);
		setPrecio(precio);
		setTipo(tipo);
	}

	private void setPatente(String patente) {
		this.patente = patente;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	private void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public TipoVehiculo getTipo() {
		return this.tipo;
	}
	
	public String getPatente() {
		return this.patente;
	}

	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
}

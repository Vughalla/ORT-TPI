package ej3_Unidad1;

public class Atleta {
	private String nombre;
	private double tiempo;
	
	public Atleta(String nombre, double tiempo) {
		setNombre(nombre);
		setTiempo(tiempo);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getTiempo() {
		return tiempo;
	}
	
}

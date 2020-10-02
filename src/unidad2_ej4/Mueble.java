package unidad2_ej4;

public class Mueble {
	private String nombre;
	private String material;
	private String color;
	
	public Mueble(String nombre, String material, String color) {
		setNombre(nombre);
		setMaterial(material);
		setColor(color);
	}

	public String getNombre() {
		return nombre;
	}

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setMaterial(String material) {
		this.material = material;
	}

	private void setColor(String color) {
		this.color = color;
	}
}

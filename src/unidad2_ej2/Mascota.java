package unidad2_ej2;

public class Mascota {
	private String nombreAnimal;
	private TipoAnimal tipoAnimal;
	
	public Mascota(String nombreAnimal, TipoAnimal tipoAnimal) {
		setNombreAnimal(nombreAnimal);
		setTipoAnimal(tipoAnimal);
	}

	private void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}

	private void setTipoAnimal(TipoAnimal tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getNombreAnimal() {
		return nombreAnimal;
	}

	public TipoAnimal getTipoAnimal() {
		return tipoAnimal;
	}
	
	
}

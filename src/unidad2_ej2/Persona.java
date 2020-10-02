package unidad2_ej2;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> mails;
	private ArrayList<Mascota> mascotas;
	
	public Persona(String nombre, String apellido) {
		setNombre(nombre);
		setApellido(apellido);
		telefonos = new ArrayList<NumeroTelefonico>();
		mails = new ArrayList<Email>();
		mascotas = new ArrayList<Mascota>();
	}
	
	public void mostrarTodo() {
		System.out.println(this.getApellido() + ", " + this.getNombre());
		mostrarTelefonos();
		mostrarEmails();
		mostrarMascotas();
	}

	private void mostrarTelefonos() {
		System.out.println("Telefonos:");
		for (NumeroTelefonico tel: telefonos) {
			String tipoTel = checkTipoTel(tel);
			System.out.print(tipoTel + ": " +tel.getValor() + "  ");
		}		
	}
	
	private String checkTipoTel(NumeroTelefonico tel) {
		String tipoTel = "";
		if (tel.getTipoLinea() == TipoDeLinea.CELULAR) {
			tipoTel = "Celular";
		} else if (tel.getTipoLinea() == TipoDeLinea.FIJO) {
			tipoTel = "Fijo";
		} else if (tel.getTipoLinea() == TipoDeLinea.FAX) {
			tipoTel = "Fax";
		}
		return tipoTel;
	}
	
	private void mostrarEmails() {
		System.out.println("\rEmails:");
		for (Email mail: mails) {
			System.out.println(mail.getValor());
		}
	}
	
	private void mostrarMascotas() {
		System.out.println("Mascotas:");
		for (Mascota mascota: mascotas) {
			String tipoMascota = checkTipoMascota(mascota);
			System.out.print(tipoMascota + ", " +mascota.getNombreAnimal() + "  ");
		}		
	}
	
	private String checkTipoMascota(Mascota mascota) {
		String tipoMascota = "";
		if (mascota.getTipoAnimal() == TipoAnimal.PERRO) {
			tipoMascota = "Perro";
		} else if (mascota.getTipoAnimal() == TipoAnimal.GATO) {
			tipoMascota = "Gato";
		} else if (mascota.getTipoAnimal() == TipoAnimal.CONEJO) {
			tipoMascota = "Conejo";
		}
		return tipoMascota;
	}
	
	public void agregarTelefono(NumeroTelefonico telefono) {
		telefonos.add(telefono);
	}
	
	public void agregarCorreo(Email email) {
		mails.add(email);
	}
	
	public void agregarMascota(Mascota mascota) {
		mascotas.add(mascota);
	}
	
	public void borrarTelefono(NumeroTelefonico tel) {
		if (buscarTel(tel)) {
			telefonos.remove(tel);
		} else {
			System.out.println("No se encontró el teléfono.");
		}
	}
	
	private boolean buscarTel(NumeroTelefonico tel) {
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i<telefonos.size()) {
			if (telefonos.get(i) == tel) {
				encontrado = true;
			} else {
				i++;
			}
		}
		return encontrado;
	}
	
	public void borrarEmail(Email email) {
		if (buscarEmail(email)) {
			mails.remove(email);
		} else {
			System.out.println("No se encontró el email.");
		}
	}
	
	private boolean buscarEmail(Email email) {
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i<mails.size()) {
			if (mails.get(i) == email) {
				encontrado = true;
			} else {
				i++;
			}
		}
		return encontrado;
	}

	public void borrarMascota(Mascota mascota) {
		if (buscarMascota(mascota)) {
			mascotas.remove(mascota);
		} else {
			System.out.println("No se encontró la mascota.");
		}
	}
	
	private boolean buscarMascota(Mascota mascota) {
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i<mascotas.size()) {
			if (mascotas.get(i) == mascota) {
				encontrado = true;
			} else {
				i++;
			}
		}
		return encontrado;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
		
	private String getNombre() {
		return this.nombre;
	}

	private String getApellido() {
		return this.apellido;
	}
}

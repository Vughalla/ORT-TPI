package unidad2_ej1;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> mails;
	
	public Persona(String nombre, String apellido) {
		setNombre(nombre);
		setApellido(apellido);
		telefonos = new ArrayList<NumeroTelefonico>();
		mails = new ArrayList<Email>();
	}
	
	public void mostrarTodo() {
		System.out.println(this.getApellido() + ", " + this.getNombre() + "\nTelefonos:");
		for (NumeroTelefonico tel: telefonos) {
			String tipoTel = "";
			if (tel.getTipoLinea() == TipoDeLinea.CELULAR) {
				tipoTel = "Celular";
			} else if (tel.getTipoLinea() == TipoDeLinea.FIJO) {
				tipoTel = "Fijo";
			} else if (tel.getTipoLinea() == TipoDeLinea.FAX) {
				tipoTel = "Fax";
			}
			System.out.print(tipoTel + ": " +tel.getValor() + "  ");
		}
		for (Email mail: mails) {
			System.out.print("email: " +mail.getValor() + "  ");
			
		}
	}
	
	public void agregarCorreo(Email email) {
		mails.add(email);
	}
	
	public void agregarTelefono(NumeroTelefonico telefono) {
		telefonos.add(telefono);
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

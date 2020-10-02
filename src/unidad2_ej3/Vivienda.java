package unidad2_ej3;

import java.util.ArrayList;

public class Vivienda {
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	
	Vivienda(String calle, String altura, int piso, char departamento){
		setDireccion(calle, altura, piso, departamento);
		personas = new ArrayList<Persona>();
		muebles = new ArrayList<Mueble>();
	}
	
	public void mostrarTodo() {
		System.out.println("Vivienda 1:");
		this.direccion.mostrarDomicilio();
		mostrarPersonas();
		mostrarMuebles();
	}
	
	private void setDireccion(String calle, String altura, int piso, char departamento) {
		this.direccion = new Direccion(calle, altura, piso, departamento);
	}
	
	public void agregarPersona(String nombre, String apellido, int edad) {
		personas.add(new Persona(nombre, apellido, edad));
	}
	
	public void agregarMuebles(String nombre, String material, String color) {
		muebles.add(new Mueble(nombre, material, color));
	}
	
	private void mostrarPersonas() {
		System.out.println("Personas:");
		for(Persona persona: personas) {
			System.out.print("Nombre: " + persona.getNombre() + " " + persona.getApellido() + ". Edad: " + persona.getEdad() + ".  ");
		}
		System.out.print("\r");
	}
	
	private void mostrarMuebles() {
		System.out.println("Muebles:");
		for(Mueble mueble: muebles) {
			System.out.println(mueble.getNombre() + " de " + mueble.getMaterial() + " color " + mueble.getColor() + ".");
		}
	}
	
	private class Direccion{
		private String calle;
		private String altura;
		private int piso;
		private char departamento;
		
		Direccion(String calle, String altura, int piso, char departamento){
			setCalle(calle);
			setAltura(altura);
			setPiso(piso);
			setDepartamento(departamento);
		}
		
		private void mostrarDomicilio() {
			System.out.println(getCalle() + " " + getAltura() + " " + getPiso() + "°'" + getDepartamento() + "'");
		}
		
		private void setCalle(String calle) {
			this.calle = calle;
		}
		
		private void setAltura(String altura) {
			this.altura = altura;
		}
		
		private void setPiso(int piso) {
			this.piso = piso;
		}
		
		private void setDepartamento(char departamento) {
			this.departamento = departamento;
		}

		private String getCalle() {
			return this.calle;
		}

		private String getAltura() {
			return this.altura;
		}

		private int getPiso() {
			return this.piso;
		}

		private char getDepartamento() {
			return this.departamento;
		}

	}
}

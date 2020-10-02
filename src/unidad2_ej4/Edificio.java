package unidad2_ej4;

import java.util.ArrayList;

public class Edificio {
	private ArrayList<Vivienda> viviendas;
	private String calle;
	private String altura;
	
	public Edificio(String calle, String altura) {
		setCalle(calle);
		setAltura(altura);
		viviendas = new ArrayList<Vivienda>();
	}
	
	public Vivienda agregarVivienda(int piso, char departamento) {
		viviendas.add(new Vivienda(getCalle(), getAltura(), piso, departamento));
		return viviendas.get(viviendas.size()-1);
	}
	
	public void mudarTodo(Vivienda vivienda1, Vivienda vivienda2) {
		System.out.println("SE HA REALIZADO LA MUDANZA DE VIVIENDA 1 A VIVIENDA 2.");
		ArrayList<Persona> gente = vivienda1.retirarPersonas();
		ArrayList<Mueble> mueb = vivienda1.retirarMuebles();
		for (Persona persona: gente) {
			vivienda2.agregarPersona(persona);
		}
		for (Mueble mueble: mueb) {
			vivienda2.agregarMuebles(mueble);
		}
	}
	
	public void mostrarTodo() {
		for(int i = 0; i<viviendas.size(); i++) {
			System.out.println("Vivienda " + (i+1) + ":");
			viviendas.get(i).mostrarTodo();
		}
	}
	
	private void setCalle(String calle) {
		this.calle = calle;
	}
	
	private void setAltura(String altura) {
		this.altura = altura;
	}
	
	public String getCalle() {
		return this.calle;
	}
	
	public String getAltura() {
		return this.altura;
	}
	

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
		
		public void agregarPersona(Persona persona) {
			personas.add(persona);
		}
		
		public void agregarMuebles(String nombre, String material, String color) {
			muebles.add(new Mueble(nombre, material, color));
		}
		
		public void agregarMuebles(Mueble mueble) {
			muebles.add(mueble);
		}
		
	

		private ArrayList<Persona> retirarPersonas() {
			ArrayList<Persona> gente = new ArrayList<Persona>();
			for(Persona persona: this.personas) {
				gente.add(persona);
			}
			this.personas.removeAll(this.personas);
			return gente;
		}
		

		private ArrayList<Mueble> retirarMuebles() {
			ArrayList<Mueble> mueb = new ArrayList<Mueble>();
			for(Mueble mueble: this.muebles) {
				mueb.add(mueble);
			}
			this.muebles.removeAll(this.muebles);
			return mueb;
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
}

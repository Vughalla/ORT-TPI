package unidad2_ej2;

public class Test {

	public static void main(String[] args) {
		Persona persona = new Persona("Lionel","Messi");
		persona.agregarTelefono(new NumeroTelefonico(549, 114111, 2222, TipoDeLinea.CELULAR));
		persona.agregarTelefono(new NumeroTelefonico(68, 032444, 5678, TipoDeLinea.CELULAR));
		persona.agregarTelefono(new NumeroTelefonico(54, 4411, 5472, TipoDeLinea.FIJO));
		persona.agregarCorreo(new Email("lio@messi.com"));
		persona.agregarCorreo(new Email("liomessi_newlls@hotmail.com"));
		persona.agregarMascota(new Mascota("Pluto", TipoAnimal.PERRO));
		persona.agregarMascota(new Mascota("Felix", TipoAnimal.GATO));
		persona.agregarMascota(new Mascota("Bugs", TipoAnimal.CONEJO));
		
		persona.mostrarTodo();
		
		
		
	}

}

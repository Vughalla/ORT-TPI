package unidad2_ej1;

public class Test {

	public static void main(String[] args) {
		Persona persona = new Persona("Lionel","Messi");
		NumeroTelefonico celular1 = new NumeroTelefonico(549, 114111, 2222, TipoDeLinea.CELULAR);
		NumeroTelefonico celular2 = new NumeroTelefonico(68, 032444, 5678, TipoDeLinea.CELULAR);
		NumeroTelefonico fijo1 = new NumeroTelefonico(54, 4411, 5472, TipoDeLinea.FIJO);
		Email mail = new Email("lio@messi.com");
		
		persona.agregarTelefono(celular1);
		persona.agregarTelefono(celular2);
		persona.agregarTelefono(fijo1);
		persona.agregarCorreo(mail);
		
		persona.mostrarTodo();
		
	}

}

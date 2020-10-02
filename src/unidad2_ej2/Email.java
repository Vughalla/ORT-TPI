package unidad2_ej2;

public class Email {
	private String cuenta;
	private String dominio;
	
	public Email(String mail){
		if(checkFormato(mail)) {
			setCuenta(mail.split("@", 2));
			setDominio(mail.split("@", 2));	
		}
	}
	
	private boolean checkFormato(String mail) {
		boolean formatoCorrecto = false;
		boolean puntAntArroba = false;
		int contPuntDpsArroba = 0;
		int cantArroba = 0;

		for (int i=0; i<mail.length(); i++) {
			if (cantArroba == 0 && mail.charAt(i) == '.') {
				puntAntArroba = true;
			} else if (mail.charAt(i) == '@') {
				cantArroba = cantArroba + 1;
			} else if (cantArroba == 1 && mail.charAt(i) == '.') {
				contPuntDpsArroba = contPuntDpsArroba + 1;
			}
		}
		if (cantArroba == 1 && !puntAntArroba && contPuntDpsArroba >= 1) {
			formatoCorrecto = true;
		} else {
			System.out.println("El formato del mail es incorrecto.");
		}
		
		return formatoCorrecto;
	}

	private void setCuenta(String[] cuenta) {
		this.cuenta = cuenta[0];
	}
	
	private void setDominio(String[] dominio) {
		this.dominio = dominio[1];
	}

	public String getValor() {
		return cuenta + "@" + dominio;
	}
}

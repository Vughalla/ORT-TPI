package primerParcial;


public class Parcial1 {

	public static void main(String[] args) {
		// Se crea e inicializa la guardería
	
		GuarderiaNautica guarderia = new GuarderiaNautica(new Fecha(2020, 9, 22));
		guarderia.registrarEmbarcacion("AA01", new Fecha(2019, 11, 4));
		guarderia.registrarEmbarcacion("BB34", new Fecha(2020, 03, 12));

		// Para coincidir con el enunciado completamos los pagos requeridos de
		// las dos embarcaciones.
		System.out.println("Se registran todos los pagos de la embarcacion 'AA01'");
		for (int mes = 1; mes <= 9; mes++) {
			guarderia.pagarCuota("AA01", "BARCO.RIO.PIEDRAS", 3000);
		}
		guarderia.pagarCuota("BB34", "SOL.PESCA.AGUA", 3000);
		
		// Se emite el listado requerido
		
		guarderia.mostrarCuotasAdeudadas();
		
	}

}
package socio;

public class Test {

	public static void main(String[] args) {
		Club club = new Club("Left 4 Dead");

		club.agregarSocio("Juan Fernandez", 750);
		club.agregarSocio("Ricardo", 270);
		club.agregarSocio("Osvaldo", 400);
		club.agregarSocio("Juan", 2750);
		club.agregarSocio("Mauricio", 1750);
		club.agregarSocio("Mauricio", 1750);
		club.verDetalleDeuda("Mauricio");
		club.cargarPago("Mauricio", 750);
		club.cargarPago("Mauricio", 750);
		club.cargarPago("Mauricio", 150);
		club.cargarPago("Mauricio", 100);
		club.cargarPago("Mauricio", 3750);
		club.cargarPago("Mauricio", 1000);
		club.cargarPago("Mauricio", 1000);
		club.cargarPago("Mauricio", 1000);
		club.verDetalleDeuda("Mauricio");
	}

}

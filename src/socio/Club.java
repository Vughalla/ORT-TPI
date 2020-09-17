package socio;

import java.util.ArrayList;
public class Club {
	private String nombre;
	private ArrayList<Socio> socios;
	private int INSCRIPCION_ANUAL = 12;
	
	Club(String nombre) {
		setNombre(nombre);
		socios = new ArrayList<Socio>();
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
		System.out.println("Bienvenido al club "+this.nombre);
	}
	
	public void agregarSocio(String nombreSocio, double valorCuota) {
		if (buscarSocio(nombreSocio) == null) {
			socios.add(new Socio(nombreSocio, valorCuota, INSCRIPCION_ANUAL));
		} else {
			System.out.println("Ya existe el socio " +nombreSocio+".");
		}
	}
	
	private Socio buscarSocio(String nombreSocio) {
		Socio socio = null;
		int i = 0;
		while(socio == null && i<socios.size()) {
			if(socios.get(i).getNombre().matches(nombreSocio)) {
				socio = socios.get(i);
			} else {
				i++;
			}
		}
		return socio;
	}
	
	public void verDetalleDeuda(String nombreSocio) {
		Socio socio = buscarSocio(nombreSocio);
		if(socio != null) {
			socio.mostrarDeuda();
		} else {
			System.out.println("No se encontró el socio.");
		}
	}
	
	public void cargarPago(String nombreSocio, double importe) {
		Socio socio = buscarSocio(nombreSocio);
		if(socio != null) {
			System.out.println("Ingresando pago del socio "+nombreSocio+ " por un monto de $"+importe);
			socio.pagarCuotas(importe);
		} else {
			System.out.println("No se encontró el socio.");
		}
	}
}

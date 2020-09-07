package ej3_Unidad1;
import java.util.ArrayList;
import ej3_Unidad1.Atleta;

public class Carrera {

	private static ArrayList<Atleta> podio(ArrayList<Atleta> atletas) {
		ArrayList<Atleta> podio = new ArrayList<Atleta>();
		double mejorTiempo;
		mejorTiempo = mejorTiempo(atletas);
		
		for(Atleta atleta: atletas) {
			if (atleta.getTiempo() == mejorTiempo) {
				podio.add(atleta);
			}
		}
		limpiarLista(podio, atletas);
		return podio;
	}
	
	private static double mejorTiempo(ArrayList<Atleta> atletas) {
		double mejorTiempo = 999999999;
		for(Atleta atleta: atletas) {
			if (atleta.getTiempo() < mejorTiempo) {
				mejorTiempo = atleta.getTiempo();
			}
		}
		return mejorTiempo;
	}
	

	private static void limpiarLista(ArrayList<Atleta> puesto, ArrayList<Atleta> atletas) {
		for (Atleta atleta: puesto) {
			atletas.remove(atleta);
		}

	}
	
	private static void ganadores(ArrayList<Atleta> primerPuesto, ArrayList<Atleta> segundoPuesto, ArrayList<Atleta> tercerPuesto) {
		mostrarGanadores("El primer lugar es para: ", primerPuesto);
		mostrarGanadores("El segundo lugar es para: ", segundoPuesto);
		mostrarGanadores("El tercer lugar es para: ", tercerPuesto);
	}
	
	private static void mostrarGanadores(String mensaje, ArrayList<Atleta> alPodio) {
		System.out.println(mensaje);
		for (Atleta atleta: alPodio) {
			System.out.println(atleta.getNombre());
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<Atleta> atletas = new ArrayList<Atleta>();
		ArrayList<Atleta> primerPuesto = new ArrayList<Atleta>();
		ArrayList<Atleta> segundoPuesto = new ArrayList<Atleta>();
		ArrayList<Atleta> tercerPuesto = new ArrayList<Atleta>();
		
		atletas.add(new Atleta("Marce", 13.73));
		atletas.add(new Atleta("Juan", 12.33));
		atletas.add(new Atleta("Sofia", 7.02));
		atletas.add(new Atleta("Rulo", 9.63));
		atletas.add(new Atleta("Micho", 14.67));
		atletas.add(new Atleta("Tito", 15.10));
		atletas.add(new Atleta("Negro", 12.33));
		atletas.add(new Atleta("Pela", 7.02));

		primerPuesto = podio(atletas);
		segundoPuesto = podio(atletas);
		tercerPuesto = podio(atletas);

		ganadores(primerPuesto, segundoPuesto, tercerPuesto);
	}

}

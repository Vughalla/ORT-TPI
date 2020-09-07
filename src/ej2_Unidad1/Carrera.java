package ej2_Unidad1;

import java.util.ArrayList;

import ej3_Unidad1.Atleta;

public class Carrera {
	private static ArrayList<Atleta> atletas;
		
	private static void buscarGanador() {
		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();
		Atleta ganador = new Atleta("N/A",999999999);
		for(Atleta atleta: atletas) {
			if (atleta.getTiempo() < ganador.getTiempo()) {
				ganadores.clear();
				ganador = atleta;
				ganadores.add(ganador);
			} else if (atleta.getTiempo() == ganador.getTiempo()){
				ganadores.add(atleta);
			}
		}
		mostrarGanadores(ganadores);
	}
	
	private static void mostrarGanadores(ArrayList<Atleta> ganadores) {
		System.out.println("Llegó en primer lugar:");
		for (Atleta atleta: ganadores) {
			System.out.println(atleta.getNombre());
		}
	}
	
	public static void main(String[] args) {
		atletas = new ArrayList<Atleta>();
		atletas.add(new Atleta("Marce", 13.73));
		atletas.add(new Atleta("Juan", 12.33));
		atletas.add(new Atleta("Sofia", 7.01));
		atletas.add(new Atleta("Rulo", 9.63));
		atletas.add(new Atleta("Micho", 6.67));
		atletas.add(new Atleta("Tito", 15.10));
		atletas.add(new Atleta("Negro", 12.33));
		atletas.add(new Atleta("Pela", 7.01));
		buscarGanador();
		
	}
	


}

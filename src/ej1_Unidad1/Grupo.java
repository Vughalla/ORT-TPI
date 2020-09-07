package ej1_Unidad1;
import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo(String nombre) {
		setNombre(nombre);
		integrantes = new ArrayList<String>();
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		String intExistente = buscarIntegrante(nombreIntegrante);
		if(intExistente == null) {
			this.integrantes.add(nombreIntegrante);
			System.out.println("["+nombreIntegrante+"] fue agregado al grupo ["+getNombre()+"]");
		} else {
			System.out.println("Ya existe el integrante " +nombreIntegrante+ " en la lista.");
		}
	}
	
	/* NO SE LE ENCONTRÓ USO DENTRO DEL PROGRAMA
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int posicionIntegrante = -1; 
		int i = 0; 
		while (posicionIntegrante != i && i < getCantidadIntegrantes()) {
			if (this.integrantes.get(i).matches(nombreIntegrante)) {
				posicionIntegrante = i;
			}
		}
		return posicionIntegrante;
	}
	NO SE LE ENCONTRÓ USO DENTRO DEL PROGRAMA */
	
	public String obtenerIntegrante(int posicion) {
		if (posicion >= 1 && posicion <= getCantidadIntegrantes()) {
			return integrantes.get(posicion-1);
		} else {
			return null;
		}
	}
	
	public String buscarIntegrante(String nombreIntegrante) {
		String intEncontrado = null;
		int i = 0;
		while (intEncontrado == null && i < getCantidadIntegrantes()) {
			if (this.integrantes.get(i).matches(nombreIntegrante)) {
				intEncontrado = nombreIntegrante;
			} else {
				i++;
			}
		}
		return intEncontrado;
	}
	
	public String removerIntegrante(String nombreIntegrante) {
		String integrante = null;
		integrante = buscarIntegrante(nombreIntegrante);
		if (integrante != null) {
			this.integrantes.remove(nombreIntegrante);
		}
		return integrante;
	}

	private void mostrarIntegrantes() {
		System.out.println("Nombre de grupo: " + getNombre());
		System.out.println("Los integrantes del grupo son: " + integrantes);
		System.out.println("Hay " + getCantidadIntegrantes() + " integrantes.");
	}
	
	public void mostrar() {
		mostrarIntegrantes();
	}
	
	public void vaciar() {
		int toRemove = getCantidadIntegrantes();
		for (int i=0, j=0; i<toRemove; i++) {
			this.integrantes.remove(j);
		}
	}
}

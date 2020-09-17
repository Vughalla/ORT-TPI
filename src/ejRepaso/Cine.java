package ejRepaso;
import java.util.ArrayList;

public class Cine {
	private String nombre;
	private ArrayList<Funcion> funciones;
	private ArrayList<Entrada> entradasEmitidas;

	public Cine() {
		setNombre("ORT Buster");
		funciones = new ArrayList<Funcion>();
		entradasEmitidas = new ArrayList<Entrada>();
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
/*
	public void procesarEntradas(ArrayList<Entrada> entradas){
		if(checkFuncion(entradas)) {
			buscarFuncion();
			if(checkAsiento(entradas)) {
				
			} else {
				System.out.println("Función no encontrada.");
			}
		} else {
			System.out.println("Función no encontrada.");
		}
	}
	

	private Funcion checkFuncion(ArrayList<Entrada> entradas) {
		int i = 0;;
		boolean entradasValidas = false;
		Funcion funcion = null;
		while (entradasValidas == false && i < entradas.size()) {
			funcion = buscarFuncion(entradas.get(i).getDia(), entradas.get(i).getHoraInicio()); 
			if(funcion != null) {
				entradasValidas = true;	
			} else {
				i++;
			}
		}
		
		return entradasValidas;
	}
*/
	private Funcion buscarFuncion(String dia, String hora) {
		Funcion funcionExistente = null;
		int j = 0;
		while(funcionExistente == null && j < funciones.size()) {
			String diaFuncion = funciones.get(j).getDia();
			String horaFuncion = funciones.get(j).getHoraInicio();
			if (!diaFuncion.matches(dia) && !horaFuncion.matches(hora)) {
				funcionExistente = funciones.get(j);
			} else {
				j++;
			}
		}
		return funcionExistente;
	}
	
	private Funcion buscarFuncion(ArrayList<Entrada> entradas) {
		Funcion funcionEncontrada = null;
		int i = 0;
		while (funcionEncontrada == null && i < entradas.size()) {
			
			
		}
		
		return funcionEncontrada;
	}
	
	private boolean checkAsiento(ArrayList<Entrada> entradas) {
		boolean enOrden = false;
		
		
		return enOrden;
	}
}

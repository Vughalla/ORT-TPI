package ej1_Unidad1;

public class Test {

	private static void checkIntegrante(Grupo grupo, String nombreIntegrante) {
		String integrante = null;
		integrante = grupo.buscarIntegrante(nombreIntegrante);
		if (integrante != null) {
			System.out.println("El integrante [" +nombreIntegrante+ "] existe dentro del grupo [" +grupo.getNombre()+"]");
		} else { 
			System.out.println("El integrante [" +nombreIntegrante+ "] no existe dentro del grupo [" +grupo.getNombre()+"]");
		}
	}
	
	public static void main(String[] args) {
		Grupo grupo = new Grupo("Prueba");
		
		grupo.agregarIntegrante("Federico Musmano");
		grupo.agregarIntegrante("Lucas Goldberg");
		grupo.agregarIntegrante("Nicolas Escandalani");
		grupo.agregarIntegrante("Emmanuel Belascuain");
		grupo.agregarIntegrante("Marcos Di C�sare");
		
		grupo.mostrar();
		
		checkIntegrante(grupo, "Marcos Di C�sare");
		
		System.out.println(grupo.removerIntegrante("Marcos Di C�sare"));
		System.out.println(grupo.removerIntegrante("Marcos Di C�sare"));
		
		checkIntegrante(grupo, "Marcos Di C�sare");
		
		grupo.mostrar();
		grupo.vaciar();
		grupo.mostrar();
		
		
		
		
	}

}

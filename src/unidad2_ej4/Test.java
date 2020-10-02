package unidad2_ej4;

import unidad2_ej4.Edificio.Vivienda;

public class Test {

	public static void main(String[] args) {
		Edificio edificio = new Edificio("Monta�eses", "1234");
		
		Vivienda vivienda1 = edificio.agregarVivienda(4, 'C');
		Vivienda vivienda2 = edificio.agregarVivienda(2, 'B');
		
		vivienda1.agregarPersona("Arturo", "Roman", 53);
		vivienda1.agregarPersona("Gaztambide", "M�nica", 35);
		
		vivienda1.agregarMuebles("Mesa", "Madera", "Marr�n");
		vivienda1.agregarMuebles("Mesada", "M�rmol", "Rojo");
		vivienda1.agregarMuebles("Perchero", "Metal", "Negro");
		vivienda1.agregarMuebles("Sill�n", "Cuero", "Azul");
		
		
		edificio.mudarTodo(vivienda1, vivienda2);
		
		edificio.mostrarTodo();
	}

}

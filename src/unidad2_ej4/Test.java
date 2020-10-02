package unidad2_ej4;

import unidad2_ej4.Edificio.Vivienda;

public class Test {

	public static void main(String[] args) {
		Edificio edificio = new Edificio("Montañeses", "1234");
		
		Vivienda vivienda1 = edificio.agregarVivienda(4, 'C');
		Vivienda vivienda2 = edificio.agregarVivienda(2, 'B');
		
		vivienda1.agregarPersona("Arturo", "Roman", 53);
		vivienda1.agregarPersona("Gaztambide", "Mónica", 35);
		
		vivienda1.agregarMuebles("Mesa", "Madera", "Marrón");
		vivienda1.agregarMuebles("Mesada", "Mármol", "Rojo");
		vivienda1.agregarMuebles("Perchero", "Metal", "Negro");
		vivienda1.agregarMuebles("Sillón", "Cuero", "Azul");
		
		
		edificio.mudarTodo(vivienda1, vivienda2);
		
		edificio.mostrarTodo();
	}

}

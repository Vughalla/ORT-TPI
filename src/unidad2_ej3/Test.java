package unidad2_ej3;

public class Test {

	public static void main(String[] args) {
		Vivienda vivienda = new Vivienda("Montañeses", "1234",4,'C');
		
		vivienda.agregarPersona("Arturo", "Roman", 53);
		vivienda.agregarPersona("Gaztambide", "Mónica", 35);
		
		vivienda.agregarMuebles("Mesa", "Madera", "Marrón");
		vivienda.agregarMuebles("Mesada", "Mármol", "Rojo");
		vivienda.agregarMuebles("Perchero", "Metal", "Negro");
		vivienda.agregarMuebles("Sillón", "Cuero", "Azul");
		
		vivienda.mostrarTodo();
	}

}

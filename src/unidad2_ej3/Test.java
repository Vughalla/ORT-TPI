package unidad2_ej3;

public class Test {

	public static void main(String[] args) {
		Vivienda vivienda = new Vivienda("Monta�eses", "1234",4,'C');
		
		vivienda.agregarPersona("Arturo", "Roman", 53);
		vivienda.agregarPersona("Gaztambide", "M�nica", 35);
		
		vivienda.agregarMuebles("Mesa", "Madera", "Marr�n");
		vivienda.agregarMuebles("Mesada", "M�rmol", "Rojo");
		vivienda.agregarMuebles("Perchero", "Metal", "Negro");
		vivienda.agregarMuebles("Sill�n", "Cuero", "Azul");
		
		vivienda.mostrarTodo();
	}

}

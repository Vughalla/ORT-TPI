package ej4_Unidad1;
import ej4_Unidad1.Anio;

public class Test {

	public static void main(String[] args) {
		Anio anio = new Anio();
		
		for (int i = 1; i <= 12; i++) {
			System.out.println(anio.getNombreDelMes(i));	
		}
		
		System.out.println("--------");	
		
		for (int i = 1; i < 12; i++) {
			System.out.println(anio.diasTranscurridos(i));	
		}

	}

}

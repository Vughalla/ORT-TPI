package ej5_Unidad1;
import ej5_Unidad1.AnioV2;

public class Test {

	public static void main(String[] args) {
		AnioV2 anio = new AnioV2();
		
		for (int i = 1; i <= 12; i++) {
			System.out.println(anio.getNombreDelMes(i));	
		}
		
		System.out.println("--------");	
		
		for (int i = 1; i < 12; i++) {
			System.out.println(anio.diasTranscurridos(i));	
		}

	}

}

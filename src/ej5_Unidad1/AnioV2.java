package ej5_Unidad1;

public class AnioV2 {
	private int[] diasMeses;
	
	public AnioV2() {
		diasMeses = new int[12];
		setDiasMeses();
	}

	private void setDiasMeses() {
		diasMeses[0] = 31;
		diasMeses[1] = 28;
		diasMeses[2] = 31;		
		diasMeses[3] = 30;
		diasMeses[4] = 31;
		diasMeses[5] = 30;
		diasMeses[6] = 31;
		diasMeses[7] = 31;
		diasMeses[8] = 30;
		diasMeses[9] = 31;
		diasMeses[10] = 30;
		diasMeses[11] = 31;
	}
	
	public Mes getNombreDelMes(int numMes) {
		return Mes.values()[numMes-1];
	}
	
	public int diasTranscurridos(int numMes) {
		int diasTranscurridos = 0;
		for (int i=0; i < numMes; i++) {
			diasTranscurridos = diasTranscurridos + this.diasMeses[i];
		}
		return diasTranscurridos;
	}
}

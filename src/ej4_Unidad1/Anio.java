package ej4_Unidad1;

public class Anio {
	private String[] meses;
	private Integer[] diasMeses;
	
	public Anio() {
		meses = new String[12];
		diasMeses = new Integer[12];
		setMeses();
		setDiasMeses();
	}

	private void setMeses() {
		meses[0] = "Enero";
		meses[1] = "Febrero";
		meses[2] = "Marzo";
		meses[3] = "Abril";
		meses[4] = "Mayo";
		meses[5] = "Junio";
		meses[6] = "Julio";
		meses[7] = "Agosto";
		meses[8] = "Septiembre";
		meses[9] = "Octubre";
		meses[10] = "Noviembre";
		meses[11] = "Diciembre";
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
	
	public String getNombreDelMes(int numMes) {
		return this.meses[numMes-1];
	}
	
	public int diasTranscurridos(int numMes) {
		int diasTranscurridos = 0;
		for (int i=0; i < numMes; i++) {
			diasTranscurridos = diasTranscurridos + this.diasMeses[i];
		}
		return diasTranscurridos;
	}
}

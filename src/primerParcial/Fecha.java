package primerParcial;

public class Fecha {
	// La estructura que guarda la cantidad de días del mes será
	// compartida por todas las instancias de Fecha
	private static int[] diasMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private int anio;
	private int mes;
	private int dia;
	private int numDia; // Dia del anio correspondiente a esta fecha

	public Fecha(int anio, int mes, int dia) {
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
		calcularDiaDelAnio();
		chequearFecha();
	}

	private void chequearFecha() {
		// Primero veo que la fecha pertenezca a este anio y no a uno posterior.
		int dias = (esBisiesto(anio)) ? 366 : 365;
		while (numDia > dias) {
			numDia -= dias;
			anio++;
			dias = (esBisiesto(anio)) ? 366 : 365;
		}
		// ya quedan menos dias que los que tiene el anio... ahora a ver el mes
		int mesAux = 1;
		dias = getDiasMes(mesAux);
		while (numDia > dias) {
			numDia -= dias;
			mesAux++;
			dias = getDiasMes(mesAux);
		}
		// sumo 1 porque no quiero guardar el mes en "base cero".
		mes = mesAux;
		dia = numDia;
	}

	private void calcularDiaDelAnio() {
		this.numDia = 0;
		for (int m = 1; m < mes; m++) {
			this.numDia += getDiasMes(m);
		}
		numDia += dia;
	}

	private int getDiasMes(int m) {
		return getDiasMes(this.anio, m);
	}

	public static boolean esBisiesto(int anio) {
		return ((anio % 4 == 0) && (anio % 400 != 0));
	}

	public static int getDiasMes(int anio, int mes) {
		int dias = diasMes[mes - 1];
		if (mes == 2 && esBisiesto(anio))
			dias++;
		return dias;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	public int getNumDia() {
		return numDia;
	}

	@Override
	public String toString() {
		return String.format("%s/%s/%s", dia, mes, anio);
	}

}
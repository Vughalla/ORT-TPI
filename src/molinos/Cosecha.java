package molinos;

public class Cosecha {
	private String nombre;
	private String fecha;
	private String cultivo;
	private int kilos;
	private int altura;
	private int humedad;
	
	public Cosecha(String nombre, String cultivo, String fecha, int kilos, int altura, int humedad) {
		setNombre(nombre);
		setCultivo(cultivo);
		setFecha(fecha);
		setKilos(kilos);
		setAltura(altura);
		setHumedad(humedad);
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getFecha() {
		return Integer.parseInt(fecha);
	}

	public int getCultivo() {
		return Integer.parseInt(cultivo);
	}

	public int getKilos() {
		return kilos;
	}

	public int getAltura() {
		return altura;
	}

	public int getHumedad() {
		return humedad;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	private void setCultivo(String cultivo) {
		this.cultivo = cultivo;
	}
	
	private void setKilos(int kilos) {
		this.kilos = kilos;
	}
	
	private void setAltura(int altura) {
		this.altura = altura;
	}
	
	private void setHumedad(int humedad) {
		this.humedad = humedad;
	}
	
	@Override
	public String toString() {
		return ". Kilos: " +kilos+ ". Altura: " +altura+ ". Humedad: " +humedad;
	}
	
}

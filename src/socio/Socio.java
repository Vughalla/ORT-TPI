package socio;

public class Socio {
	private String nombre;
	private Cuota[] cuotas;
	
	public Socio(String nombre, double valorCuota, int meses) {
		setNombre(nombre);
		setCuota(valorCuota, meses);
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setCuota(double valorCuota, int meses) {
		cuotas = new Cuota[meses];
		for(int i=0; i<meses; i++) {
			cuotas[i] = new Cuota(valorCuota);
		}
		
	}
	
	public void mostrarDeuda() {
		double total = 0;
		for (int i=0; i<cuotas.length; i++) {
			if(cuotas[i].getCuotaAdeudada() > 0) {
				System.out.println("Se adeudan $" +cuotas[i].getCuotaAdeudada()+ " del mes "+(i+1));
				total = total + cuotas[i].getCuotaAdeudada();
			} else {
				System.out.println("El mes "+(i+1)+ " se encuentra saldado.");
			}
		}
		System.out.println("Deuda total: $" +total);
	}
	
	public void pagarCuotas(double importe) {
		int i = 0;
		double monto;
		while (importe > 0 && i < cuotas.length) {
			if(cuotas[i].getCuotaAdeudada() > 0 && cuotas[i].getCuotaAdeudada() < importe) {
				monto = cuotas[i].getCuotaAdeudada();
				cuotas[i].pagarCuota(cuotas[i].getCuotaAdeudada());
				importe = importe - monto;
			} else if (cuotas[i].getCuotaAdeudada() > 0 && cuotas[i].getCuotaAdeudada() > importe) {
				cuotas[i].pagarCuota(importe);
				importe = 0;
			} else if(cuotas[i].getCuotaAdeudada() > 0 && cuotas[i].getCuotaAdeudada() == importe) {
				cuotas[i].pagarCuota(importe);
				importe = 0;
			} else {
				i++;
			}
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
}

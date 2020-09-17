package molinos;

import java.util.ArrayList;
public class EmpresaAgricola {
	private String nombre;
	private ArrayList<Cosecha> cosechas;
	private String[] columnas;
	private int[][] resultadosCosecha;
	private static String[] tipoCultivo = {"TRIGO","MAIZ","SOJA"};
	
	
	public EmpresaAgricola(String nombre, int elementos) {
		setNombre(nombre);
		columnas = new String[elementos];
		resultadosCosecha = new int[elementos][elementos];
		cosechas = new ArrayList<Cosecha>();
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarCosecha(Cosecha cosecha) {
		cosechas.add(cosecha);
	}
	
	public void cargarResultados() {
		int cultivoIndex = 1;
		columnas[0] = "Cosecha";
		columnas[1] = "Tipo Cultivo";			
		columnas[2] = "Fecha";
		columnas[3] = "Kilos";
		columnas[4] = "Altura";
		columnas[5] = "Humedad";
		
		for (int i=0; i<resultadosCosecha.length; i++) {
			resultadosCosecha[i][0] = cultivoIndex;
			resultadosCosecha[i][1] = cosechas.get(i).getCultivo();
			resultadosCosecha[i][2] = cosechas.get(i).getFecha();
			resultadosCosecha[i][3] = cosechas.get(i).getKilos();
			resultadosCosecha[i][4] = cosechas.get(i).getAltura();
			resultadosCosecha[i][5] = cosechas.get(i).getHumedad();
			cultivoIndex++;
		}
		
	}
	
	public void mostrarResultados() {
		for (int i=0; i<this.columnas.length; i++) {
			System.out.print(columnas[i]+ "\t\t");
		}
		
		for (int i=0; i<this.resultadosCosecha.length; i++) {
			System.out.println(" ");
			for(int j=0; j<this.resultadosCosecha[i].length; j++) {
				System.out.print(this.resultadosCosecha[i][j]+ "\t\t");
			}
		}
		System.out.println(" ");
	}
	
	public String buscarCosecha(int cosecha) {
		int pos = 0;
		int i = 0;
		boolean encontrada = false;
		while (!encontrada && i<resultadosCosecha[i][0]) {
			if (cosecha == resultadosCosecha[i][0]) {
				encontrada = true;
				pos = i;
			} else {
				i++;
			}
		}
		
		return "Resultados de la cosecha "+cosecha+": Fecha: "+resultadosCosecha[pos][2]+ ". Cultivo: " +tipoCultivo[resultadosCosecha[pos][1]-1] + ". Kilos: " +resultadosCosecha[pos][3] + ". Altura: " +resultadosCosecha[pos][4] + ". Humedad: " +resultadosCosecha[pos][5];
	}

	public String obtenerCosechaConMasKilos() {
		int mayorCosecha = -1;
		int posMayor = -1;
		for(int i=0; i<resultadosCosecha.length; i++) {
			if (cosechas.get(i).getKilos() > mayorCosecha) {
				mayorCosecha = cosechas.get(i).getKilos();
				posMayor = i;
			}
		}
		
		return "La cosecha con más kilos fue la numero: "+resultadosCosecha[posMayor][0];
	}

	
	public String obtenerCosechaConMasAltura() {
		int mayorAltura = -1;
		int posMayor = -1;
		for(int i=0; i<resultadosCosecha.length; i++) {
			if (cosechas.get(i).getAltura() > mayorAltura) {
				mayorAltura = cosechas.get(i).getAltura();
				posMayor = i;
			}
		}
		
		return "La cosecha con más altura fue la numero: "+resultadosCosecha[posMayor][0];
	}
}


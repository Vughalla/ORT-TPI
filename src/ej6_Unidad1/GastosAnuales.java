package ej6_Unidad1;
import java.util.ArrayList;

public class GastosAnuales {
	private ArrayList<Rubro> rubros;
	
	public GastosAnuales() {
		rubros = new ArrayList<Rubro>();
	}
	
	public void agregarGasto(Mes mes, String nombreRubro, double importe) {
		Rubro rubro;
		rubro = buscarRubro(nombreRubro);
		if (rubro == null) {
			obtenerRubro(nombreRubro);
		}
		
		rubro.agregarGasto(mes, importe);
	}
	
	private Rubro buscarRubro(String nombreRubro) {
		Rubro rubro = null;
		int i = 0;
		while(rubro == null && i < rubros.size()) {
			if (nombreRubro.matches(rubros.get(i).getNombre())) {
				rubro = rubros.get(i);
			} else {
				i++;
			}
		}
		return rubro;
	}
	
	private Rubro obtenerRubro(String nombreRubro) {
		Rubro rubro;
		rubros.add(new Rubro(nombreRubro));
		rubro = rubros.get(rubros.size()-1);
		return rubro;
	}
	
	private double[][] consolidadoDeGastos(){
		double[][] gastosAnuales = new double[rubros.size()][12];
		for (int i=0; i<rubros.size(); i++) {
			for(int j=0; j<12; j++) {
				gastosAnuales[i][j] = rubros.get(i).getGastos(Mes.values()[j]);
			}
		}
		return gastosAnuales;
	}
	
	public double gastoAcumulado(Mes mes) {
		double importe = 0;
		for(Rubro rubro: rubros) {
			importe = importe + rubro.getGastos(mes);
		}
		return importe;
	}
	
	public double gastoAcumulado(String nombreRubro) {
		double importe = 0;
		Rubro rubro = buscarRubro(nombreRubro);
		if (rubro != null) {
			for(int i=0; i<12; i++) {
				importe = importe + rubro.getGastos(Mes.values()[i]);
			}
		} else {
			importe = -1;
		}
		return importe;
	}
	
	public void informarConsumosPorMes() {
		double[][] gastosAnuales = consolidadoDeGastos();
		for (int i=0; i<rubros.size(); i++) {
			System.out.println("Rubro:" +rubros.get(i).getNombre());
			for (int j=0; j<12; j++) {
				System.out.println(Mes.values()[j] + ":");
				System.out.println(gastosAnuales[i][j]);
			}
		}
	}
	
	public void informarPromedioMensualPorRubro() {
		double[][] gastosAnuales = consolidadoDeGastos();
		double promedio = 0;
		for (int i=0; i<rubros.size(); i++) {
			double acum = 0;
			System.out.println("Rubro:" +rubros.get(i).getNombre());
			for (int j=0; j<12; j++) {
				acum = acum + gastosAnuales[i][j]; 
			}
			promedio = acum / 12;
			System.out.println("Promedio de gastos: " +promedio);
		}
	}	
	
	public void informarMesMayorConsumo() {
		ArrayList<Integer> mesesMayorConsumo = new ArrayList<Integer>();
		for (int i=0; i<rubros.size(); i++) {
			mesesMayorConsumo = mesesMayorConsumo(mesesMayorConsumo, i);
			System.out.println("Rubro:" +rubros.get(i).getNombre());
			for (int j=0; j<mesesMayorConsumo.size(); j++) {
				System.out.println(Mes.values()[j] + ":");
				System.out.println(rubros.get(i).getGastos(Mes.values()[j]));	
			}
		}
	}
	
	private ArrayList<Integer> mesesMayorConsumo(ArrayList<Integer> mesesMayorConsumo, int i){
		mesesMayorConsumo.clear();
		double[][] gastosAnuales = consolidadoDeGastos();
		double mayorConsumo = 0;
		
		for (int j=0; j<12; j++) {
			if (gastosAnuales[i][j] > mayorConsumo) {
				mesesMayorConsumo.clear();
				mesesMayorConsumo.add(j);
				mayorConsumo = gastosAnuales[i][j];
			} else if (gastosAnuales[i][j] == mayorConsumo) {
				mesesMayorConsumo.add(j);
				mayorConsumo = gastosAnuales[i][j];
			}
		}
		return mesesMayorConsumo;
	}
}

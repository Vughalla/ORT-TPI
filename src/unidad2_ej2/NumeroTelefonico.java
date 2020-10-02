package unidad2_ej2;

public class NumeroTelefonico {
	private int caracteristica;
	private int numeroDeAbonado;
	private int codigoPais;
	private TipoDeLinea tipoLinea;
	
	public NumeroTelefonico(int codigoPais, int caracteristica, int numeroDeAbonado, TipoDeLinea tipoLinea) {
		setCodigoPais(codigoPais);
		setCaracteristica(caracteristica);
		setNumeroDeAbonado(numeroDeAbonado);
		setTipoLinea(tipoLinea);
	}
	
	private void setCaracteristica(int caracteristica) {
		this.caracteristica = caracteristica;
	}

	private void setNumeroDeAbonado(int numeroDeAbonado) {
		this.numeroDeAbonado = numeroDeAbonado;
	}

	private void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	private void setTipoLinea(TipoDeLinea tipoLinea) {
		this.tipoLinea = tipoLinea;
	}

	public String getValor() {
		return "(+" + codigoPais + ") " + caracteristica + "-" + numeroDeAbonado;
	}
	
	public TipoDeLinea getTipoLinea() {
		return this.tipoLinea;
	}
}

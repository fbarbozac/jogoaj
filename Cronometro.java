class Cronometro {
	private java.util.Date tempoInicial;
	private java.util.Date tempoFinal;

	public void inicie() {
		this.tempoInicial = new java.util.Date();
	}
	
	public void pare() {
		this.tempoFinal = new java.util.Date();
	}
	
	public long getIntervaloMilisegundos() {
		return (this.tempoFinal.getTime() - this.tempoInicial.getTime());
	}

	public long getIntervaloSegundos() {
		return (this.getIntervaloMilisegundos() / 1000);
	}
}
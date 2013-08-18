class Cronometro {
	private java.util.Date tempoInicial;

	public Cronometro() {
		this.tempoInicial = new java.util.Date();
	}
	
	public long getMilisegundos() {
		java.util.Date tempoFinal = new java.util.Date();
		return (tempoFinal.getTime() - this.tempoInicial.getTime());
	}

	public long getSegundos() {
		return (this.getMilisegundos() / 1000);
	}
}
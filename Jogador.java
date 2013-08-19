class Jogador {
	private String nome;
	private int pontos;
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void adicionaPontos() {
		this.pontos++;
	}
	
	public int getPontos() {
		return this.pontos;
	}
	
}
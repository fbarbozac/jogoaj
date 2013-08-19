class Tela {
	private java.io.Console console;

	public Tela() {
		this.console = System.console();
	}
	
	public Integer getNumeroJogadores() {
		// Receba a quantidade de jogadores
		return Integer.valueOf(console.readLine("Digite quantos jogadores: "));
	}
	
	public String getNomeJogador(int numeroJogador) {
		return console.readLine("Digite o nome do jogador %s: ", numeroJogador);
	}
		
	public void printNomeJogador(String nomeJogador) {
		System.out.printf("\nJogador: %s\n", nomeJogador);
	}
	
	public Integer getNumeroPerguntas() {
		// Receba a quantidade de perguntas a efetuar
		return Integer.valueOf(console.readLine("Digite quantas perguntas quer responder: "));
	}
	
	public void printNumeroPerguntas(int numeroPerguntas) {
		System.out.printf("\nAinda faltam %s perguntas\n", numeroPerguntas);
	}
	
	public void printPergunta(String pergunta) {
		System.out.println(pergunta);
	}
	
	public String getResposta() {
		return console.readLine();
	}
	
	public void printTempo(long segundos) {
		System.out.printf("Tempo gasto: %s segundos\n", segundos);
	}
	
	public void printPontuacao(String nomeJogador, int pontosJogador) {
		System.out.printf("Jogador %s;\t%s ponto(s)!!!\n", nomeJogador, pontosJogador);
	}

}
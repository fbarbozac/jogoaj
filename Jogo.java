class Jogo {
	private Tela tela;
	private Integer numeroJogadores;
	private Integer numeroPerguntas;
	private Jogador[] jogadores;
	private GeradorDePerguntas geradorDePerguntas;
	private Cronometro cronometro;
	
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		jogo.rodaJogo();
	}

	private void rodaJogo() {
		// Crie os recursos necessarios para o jogo
		geradorDePerguntas = new GeradorDePerguntas();
		cronometro = new Cronometro();
		// Crie uma interface com o usuario
		this.tela = new Tela();
		// Receba quantos jogadores
		this.numeroJogadores = this.tela.getNumeroJogadores();
		// Defina um array com n jogadores
		jogadores = new Jogador[numeroJogadores];
		// Receba o nome dos usuarios
		this.getNomeJogadores();
		// Receba quantidade de perguntas a responder
		this.numeroPerguntas = this.tela.getNumeroPerguntas();
		// Faca as perguntas aos jogadores
		this.facaPerguntas();
		// Imprima o placar final
		this.printPlacar();
	}
	
	private void getNomeJogadores() {
		// Construa os jogadores com seus nomes
		for (int contadorJogadores = 0; contadorJogadores < this.jogadores.length; contadorJogadores++) {
			this.jogadores[contadorJogadores] = new Jogador(this.tela.getNomeJogador(contadorJogadores + 1));
		}
	}
	
	private void facaPerguntas() {
		// Mostre as perguntas
		while (this.numeroPerguntas > 0) {
			this.tela.printNumeroPerguntas(this.numeroPerguntas);
			// Busque os jogadores cadastrados
			for (Jogador jogador: this.jogadores) {
				this.tela.printNomeJogador(jogador.getNome());
				this.facaPergunta();
				this.cronometro.inicie();
				if (this.isRespostaCorreta()) {
					jogador.adicionaPontos();
				}
				this.cronometro.pare();
				this.printTempo();
			}
			this.numeroPerguntas--;
		}
	}
	
	private void facaPergunta() {
		this.tela.printPergunta(geradorDePerguntas.getPergunta());
	}
	
	private boolean isRespostaCorreta() {
		return this.geradorDePerguntas.isGabarito(this.tela.getResposta());
	}
	
	private void printTempo() {
		this.tela.printTempo(this.cronometro.getIntervaloSegundos());
	}
	
	private void printPlacar() {
		for (Jogador jogador: this.jogadores) {
			this.tela.printPontuacao(jogador.getNome(), jogador.getPontos());
		}
	}


		
}
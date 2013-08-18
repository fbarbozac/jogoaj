class Tela {
	private java.io.Console console;

	public Tela() {
		this.console = System.console();
	}
	
	public Integer getNumeroJogadores() {
		// Receba a quantidade de jogadores
		return Integer.valueOf(console.readLine("Digite quantos jogadores: "));
	}
	
	public void getNomeJogadores(Jogador[] jogadores) {
		// Construa os jogadores com seus nomes
		for (int contadorJogadores = 0; contadorJogadores < jogadores.length; contadorJogadores++) {
			jogadores[contadorJogadores] = new Jogador(console.readLine("Digite o nome do jogador %s: ", (contadorJogadores + 1)));
		}
	}
		
	public Integer getNumeroPerguntas() {
		// Receba a quantidade de perguntas a efetuar
		return Integer.valueOf(console.readLine("Digite quantas perguntas quer responder: "));
	}
	
	public void facaPerguntas(Jogador[] jogadores, Integer perguntas) {
		// Mostre as perguntas
		while (perguntas > 0) {
			System.out.printf("\nAinda faltam %s perguntas\n", perguntas);
			// Busque os jogadores cadastrados
			for (Jogador jogador: jogadores) {
				System.out.printf("\nJogador: %s\n", jogador.getNome());
				if (facaPergunta()) {
					jogador.setPontos();
				}
			}
			perguntas--;
		}
	}

	private boolean facaPergunta() {
		GeraPergunta pergunta = new GeraPergunta();
		Cronometro cron = new Cronometro();
		System.out.println(pergunta.getPergunta());
		boolean resposta = (pergunta.isResposta(console.readLine()));
		System.out.printf("Tempo gasto: %s segundos\n", cron.getSegundos());
		return resposta;
	}
	
	public void imprimePlacar(Jogador[] jogadores) {
		for (Jogador jogador: jogadores) {
			System.out.printf("Jogador %s;\t%s ponto(s)!!!\n", jogador.getNome(), jogador.getPontos());
		}
	}

}
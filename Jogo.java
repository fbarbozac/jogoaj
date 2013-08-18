class Jogo {

	public static void main(String[] args) {
		// Crie uma interface com o usuario
		Tela tela = new Tela();
		// Receba quantos jogadores
		Integer numeroJogadores = tela.getNumeroJogadores();
		// Defina um array com n jogadores
		Jogador[] jogadores = new Jogador[numeroJogadores];
		// Receba o nome dos usuarios
		tela.getNomeJogadores(jogadores);
		// Receba quantidade de perguntas a responder
		Integer numeroPerguntas = tela.getNumeroPerguntas();
		// Faca as perguntas aos jogadores
		tela.facaPerguntas(jogadores, numeroPerguntas);
		// Imprima o placar final
		tela.imprimePlacar(jogadores);
	}
}
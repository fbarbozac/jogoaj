class GeradorDePerguntas {
	private String pergunta;
	private boolean gabarito;
	
	public String getPergunta() {
		int temp = new java.util.Random().nextInt(6);
		
		int operando1 = new java.util.Random().nextInt(100);
		int operando2 = new java.util.Random().nextInt(100);
		
		switch(temp)
		{
			case 0:
				this.pergunta = String.format("(%s > %s) == 0 ou 1 ?", operando1, operando2);
				this.gabarito = (operando1 > operando2);
				break;

			case 1:
				this.pergunta = String.format("(%s >= %s) == 0 ou 1 ?", operando1, operando2);
				this.gabarito = (operando1 >= operando2);
				break;

			case 2:
				this.pergunta = String.format("(%s < %s) == 0 ou 1 ?", operando1, operando2);
				this.gabarito = (operando1 < operando2);
				break;
				
			case 3:
				this.pergunta = String.format("(%s <= %s) == 0 ou 1 ?", operando1, operando2);
				this.gabarito = (operando1 <= operando2);
				break;
				
			case 4:
				this.pergunta = String.format("(%s == %s) == 0 ou 1 ?", operando1, operando2);
				this.gabarito = (operando1 == operando2);
				break;
				
			case 5:
				this.pergunta = String.format("(%s != %s) == 0 ou 1 ?", operando1, operando2);
				this.gabarito = (operando1 != operando2);
				break;
				
		}
		
		return this.pergunta;
	}
	
	public boolean isGabarito(String gabarito) {
		return (this.gabarito == (gabarito.equals("0") ? false : true));
	}
	
}	
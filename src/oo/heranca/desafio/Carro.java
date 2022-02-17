package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	private int velocidadeAtual;
	protected int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public int acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
		return velocidadeAtual;
	}
	
	public int frear() {
		if(velocidadeAtual >= 5) {
			return velocidadeAtual -= 5;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		return "Velocidade Atual " + velocidadeAtual + " Km/h";
	}
}

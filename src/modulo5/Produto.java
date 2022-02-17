package modulo5;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto() {
		
	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double descontoDiaEspecial(double descontoDiaEspecial) {
		return preco * (1 - descontoDiaEspecial);
	}
}

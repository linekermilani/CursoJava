package oo.composicao.desafio;

public class Item {

	int quantidade;
	Produto produto;
	
	Item(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public String toString() {
		return produto + 
				" Quantidade: " + quantidade;
	}
}

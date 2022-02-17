package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();
	
	Compra(Item item) {
		this.itens.add(item);
	}
	
	double obterValorCompra() {
		double valorCompra = 0;
		for (Item item : itens) {
			valorCompra += item.quantidade * item.produto.preco;
		}
		return valorCompra;
	}
	
	public String toString() {
		return "Valor da Compra: R$" + obterValorCompra()
		+ " Produtos: " + itens;
	}
}

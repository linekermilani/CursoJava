package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	double obterValorTotal(){
		double valorTotal = 0;
		for (Compra compra : compras) {
			valorTotal += compra.obterValorCompra();
		}
		return valorTotal;
	}
}

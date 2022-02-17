package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("João Correia");
		
		Produto produto1 = new Produto("Headset", 299.90);
		Produto produto2 = new Produto("Mouse", 360.00);
		
		Compra compra1 = new Compra(new Item(2, produto1));
		Compra compra2 = new Compra(new Item(2, produto2));
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
				
		System.out.println("O valor da compra1 foi de: R$" + compra1.obterValorCompra());
		System.out.println("O valor da compra2 foi de: R$" + compra2.obterValorCompra());
		System.out.println("O valor total das compras feitas por " + cliente.nome + " foi de: R$" + cliente.obterValorTotal());
		System.out.println(cliente.compras);
	}
}

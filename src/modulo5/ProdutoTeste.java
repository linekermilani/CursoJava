package modulo5;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4365.89);
		Produto p2 = new Produto("Caneta Preta", 12.56);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.descontoDiaEspecial(0.30);
		
		System.out.println(p1.nome + " " + "R$" + precoFinal1);
		System.out.println(p2.nome + " " + "R$" + precoFinal2);
		
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	} 
}

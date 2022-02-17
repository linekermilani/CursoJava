package modulo5;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Feijão", 0.293);
		Comida c2 = new Comida("Arroz", 0.315);
		Pessoa p1 = new Pessoa("Joao", 72.0);
		Pessoa p2 = new Pessoa("Maria", 58.3);
		
		System.out.println("Nome: " + p1.getNome() + " , Peso: " + p1.getPeso() + " kg");
		System.out.println("Nome: " + p2.getNome() + " , Peso: " + p2.getPeso() + " kg");
		
		p1.comer(c1);
		p2.comer(c2);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}

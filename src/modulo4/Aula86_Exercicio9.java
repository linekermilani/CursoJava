package modulo4;

import java.util.Scanner;

public class Aula86_Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int valor = 0;
		int maiorValor = 0;
		int posicaoMaiorValor = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Informe o " + (i) + "º valor: ");
			valor = scanner.nextInt();
			if(valor > maiorValor) {
				maiorValor = valor;
				posicaoMaiorValor = i;
			}
		}
		
		System.out.println("O maior valor inserido foi o: " + maiorValor + " na " + posicaoMaiorValor + "º posição");
		scanner.close();
	}

}

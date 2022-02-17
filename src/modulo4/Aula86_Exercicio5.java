package modulo4;

import java.util.Scanner;

public class Aula86_Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero = scanner.nextInt();
		int contadorDeDivisores = 0;
		
		for (int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		switch (contadorDeDivisores) {
		case 2:
			System.out.println("o número " + numero + " é primo!");
			break;
		default:
			System.out.println("o número " + numero + " não é primo!");
			break;
		}
		
		scanner.close();
	}
}

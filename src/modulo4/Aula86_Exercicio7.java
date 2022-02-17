package modulo4;

import java.util.Scanner;

public class Aula86_Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		int soma = 0;
		
		do {
			System.out.print("Informe um número (digite um negativo para encerrar): ");
			numero = scanner.nextInt();
			if (numero >= 0) {
				soma += numero;
			} else {
				System.out.println("Programa encerrado!");
			}
			System.out.println("Soma dos números: " + soma);
		} while (numero >= 0);
		
		scanner.close();
	}
}

package modulo4;

import java.util.Scanner;

public class Aula86_Exercicio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o ano: ");
		int ano = scanner.nextInt();
		
		if(ano == 0) {
			System.out.println("Ano inválido!");
		} else if (ano % 4 == 0) {
			System.out.println("Ano Bissexto");
		} else {
			System.out.println("Ano não Bissexto");
		}
		
		scanner.close();
	}
}

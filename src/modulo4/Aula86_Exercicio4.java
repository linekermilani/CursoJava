package modulo4;

import java.util.Scanner;

public class Aula86_Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int numero = scanner.nextInt();
		int contadorDeDivisores = 0;
		
		for (int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if(contadorDeDivisores == 2) {
			System.out.println("O número é primo");
		} else {
			System.out.println("O número não é primo");
		}
		scanner.close();
	}
}

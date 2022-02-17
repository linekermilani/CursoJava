package modulo4;

import java.util.Scanner;

public class Aula86_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe um número inteiro: ");
		int numero = scanner.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.println("Está entre 0 e 10 e é um número par");
			} else {
				System.out.println("Está entre 0 e 10 e é um número impar");
			}
		} else {
			System.out.println("Não está entre 0 e 10");
		}
		
		scanner.close();
	}
}

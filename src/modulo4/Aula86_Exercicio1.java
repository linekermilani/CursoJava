package modulo4;

import java.util.Scanner;

public class Aula86_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe um n�mero inteiro: ");
		int numero = scanner.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.println("Est� entre 0 e 10 e � um n�mero par");
			} else {
				System.out.println("Est� entre 0 e 10 e � um n�mero impar");
			}
		} else {
			System.out.println("N�o est� entre 0 e 10");
		}
		
		scanner.close();
	}
}

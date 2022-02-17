package modulo4;

import java.util.Scanner;

public class Aula86_Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um n�mero inteiro: ");
		int numero = scanner.nextInt();
		int contadorDeDivisores = 0;
		
		for (int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if(contadorDeDivisores == 2) {
			System.out.println("O n�mero � primo");
		} else {
			System.out.println("O n�mero n�o � primo");
		}
		scanner.close();
	}
}

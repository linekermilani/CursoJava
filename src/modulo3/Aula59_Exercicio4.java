package modulo3;

import java.util.Scanner;

public class Aula59_Exercicio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um valor: ");
		double valor = scanner.nextDouble();
		
		System.out.println("Valor ao quadrado: " + Math.pow(valor, 2));
		System.out.println("Valor ao cubo: " + Math.pow(valor, 3));
		
		scanner.close();
	}

}

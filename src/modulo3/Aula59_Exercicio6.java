package modulo3;

import java.util.Scanner;

public class Aula59_Exercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double a = 1;
		double b = 12;
		double c = -13;
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		System.out.println("O valor do delta é: " + delta);
		double x1 = (-b + Math.sqrt(delta)) / 2 * a;
		double x2 = (-b - Math.sqrt(delta)) / 2 * a;
			
		System.out.println("O valor de x1 é: " + x1);
		System.out.println("O valor de x2 é: " + x2);
		scanner.close();
	}
}

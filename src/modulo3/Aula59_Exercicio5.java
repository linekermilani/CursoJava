package modulo3;

import java.util.Locale;
import java.util.Scanner;

public class Aula59_Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a base do triangulo: ");
		double base = scanner.nextDouble();
		System.out.print("Informe a altura do triangulo: ");
		double altura = scanner.nextDouble();
		
		double area = base * altura / 2;
		
		System.out.println("A area do triangulo é: " + String.format("%.2f", area) + " m²");
		scanner.close();
	}
}

package modulo3;

import java.util.Locale;
import java.util.Scanner;

public class Aula59_Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a temperatura em Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();

		double celsius = (fahrenheit - 32) * 5/9;
		System.out.println("A temperatura em celsius é: " + String.format("%.2f", celsius));
		scanner.close();
	}
}

package modulo3;

import java.util.Locale;
import java.util.Scanner;

public class Aula59_Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a temperatura em graus Celsius: ");
		double celsius = scanner.nextDouble();

		double fahrenheit = (celsius * 9/5) + 32;
		System.out.println("A temperatura em fahrenheit é: " + String.format("%.2f", fahrenheit));
		scanner.close();
	}
}

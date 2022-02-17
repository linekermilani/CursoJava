package modulo3;

import java.util.Locale;
import java.util.Scanner;

public class Aula59_Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o peso da pessoa: ");
		double peso = scanner.nextDouble();
		System.out.print("Informe a altura da pessoa: ");
		double altura = scanner.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		System.out.println("O resultado do calculo IMC é: " + String.format("%.2f", imc));
		scanner.close();
	}

}

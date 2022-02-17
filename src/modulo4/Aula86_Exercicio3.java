package modulo4;

import java.util.Locale;
import java.util.Scanner;

public class Aula86_Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		double nota1 = scanner.nextDouble();
		System.out.print("Informe a segunda nota: ");
		double nota2 = scanner.nextDouble();
		double mediaFinal = (nota1 + nota2) / 2;
		
		if (mediaFinal >= 7.0) {
			System.out.println("Aprovado!");
		} else if (mediaFinal > 4.0) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		}
		
		scanner.close();
	}

}

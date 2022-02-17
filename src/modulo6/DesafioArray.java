package modulo6;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantas notas voc� deseja informar: ");
		int quantidade = scanner.nextInt();
		double[] notas = new double[quantidade];
		double soma = 0;
		
		for (int i = 0; i < quantidade; i++) {
			System.out.print("Informe a " + (i+1) + "� Nota: ");
			notas[i] = scanner.nextDouble();
			soma += notas[i];
		}
		
		double media = soma / quantidade;
		System.out.println("A m�dia das notas foi de: " + media);
		scanner.close();
	}

}

package modulo4;

import java.util.Random;
import java.util.Scanner;

public class Aula86_Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numeroSorteado = random.nextInt(100);
		int numero = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Voc� tem " + (10 - i) + " tentativas");
			System.out.print("Informe o n�mero sorteado: ");
			numero = scanner.nextInt();
			if(numero > numeroSorteado) {
				System.out.println("O n�mero informado � maior que o sorteado!");
			} else if (numero < numeroSorteado ) {
				System.out.println("O n�mero informado � menor que o sorteado!");
			} else {
				System.out.println("PARAB�NS!!! Voc� acertou em " + i + " tentativas");
				i = 10;
			}
		}
		
		scanner.close();
	}
}

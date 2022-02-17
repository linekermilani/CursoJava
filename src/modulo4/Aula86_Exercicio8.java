package modulo4;

import java.util.Scanner;

public class Aula86_Exercicio8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe uma palavra: ");
		String palavra = scanner.next();
		
		char letras[] = palavra.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		scanner.close();
	}

}

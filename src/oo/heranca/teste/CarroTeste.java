package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Voyage;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Voyage();
		Carro c2 = new Ferrari();
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println("Voyage: " + c1);
		System.out.println("Ferrari: " + c2);
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		c1.frear();
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		
		System.out.println("Voyage: " + c1);
		System.out.println("Ferrari: " + c2);
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.frear();
		c2.frear();
		c2.frear();

		System.out.println("Voyage: " + c1);
		System.out.println("Ferrari: " + c2);
	}
}

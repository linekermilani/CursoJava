package modulo5;

public class Aula104_AreaCirc {

	double raio;
	final static double PI = 3.1415;
	
	Aula104_AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}

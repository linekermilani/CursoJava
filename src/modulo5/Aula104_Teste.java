package modulo5;

public class Aula104_Teste {

	public static void main(String[] args) {
		
		Aula104_AreaCirc a1 = new Aula104_AreaCirc(10);
		
		System.out.println(a1.area());
		System.out.println(Aula104_AreaCirc.area(100));
		
		System.out.println(Aula104_AreaCirc.PI);
		System.out.println(Math.PI);
	}
}

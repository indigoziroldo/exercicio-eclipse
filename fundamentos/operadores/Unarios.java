package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a +1;
		a--; // a = a - 1; //incrementação mais lenta
		
		++b; // b = b+1
		--b; // b = b-1 // essa incrementação é mais rápida
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("mini desafio");
		System.out.println(++a == b--);
		System.out.println(a);
		System.out.println(b);
		
	}
}

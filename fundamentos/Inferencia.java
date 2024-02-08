package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		// o java vai inferir o tipo do var
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		c = "outro texto";
		System.out.println(c);
		
		// não dá pra mudar o tipo da variavel depois de ser settada
		
		double d; //variavel foi declarada
		d = 145.65; //variavel foi inicializada
		System.out.println(d);
		
		
	}
}

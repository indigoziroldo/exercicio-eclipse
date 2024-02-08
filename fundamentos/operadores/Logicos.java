package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("\nTabela verdade E");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true); //considera-se morto, não vai chegar a segunda parte da expressao
		System.out.println(false && false); //considera-se morto, não vai chegar a segunda parte da expressao		
		System.out.println(!false && !false); 
		
		System.out.println("\nTabela verdade OU");
		System.out.println(true || true); //considera-se morto, não vai chegar a segunda parte da expressao
		System.out.println(true || false); //considera-se morto, não vai chegar a segunda parte da expressao
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		System.out.println("\nTabela verdade OU EXCLUSIVO/XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		
		
		
	}
}

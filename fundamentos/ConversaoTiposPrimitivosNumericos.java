package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		//implícita
		double a = 1;
		System.out.println(a);
		
		//explícita (cast)
	//	float b = 1.0F; //forma padrão
		float b = (float) 1.0; //casting, forma explicita de dizer que pode converter esse valor para float
		System.out.println(b);
		
		int c = 4;
	//	byte d = c; // o java não deixa um tipo maior ser transferido pra um tipo menor
		byte d = (byte) c; //forma explicita de obrigar o java a transferir o tipo
		System.out.println(d);
		//quando der cast vc precisa ter certeza que o valor cabe dentro da outra variável
		
		double e = 1.9999;
		int f = (int) e; // ele vai ignorar todas as casas decimais
		System.out.println(f);
		
		
		
		
		
		
	}
}

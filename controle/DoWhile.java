package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		/* anatomia condicional do if:
			if (...) sentença ou {}
			while (...) sentença ou {} // uma estrutura while pode ser executada nenhuma vez ou inumeras
			for ( inicialização; expressão; mod pra variavel) sentença ou {}
			
			do sentença ou {expressão} while(...); // um dowhile precisa vai ser executado pelo menos uma vez
		*/
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("tu precisa dizer as palavras mágicas... ");
			System.out.println("queres sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("obrigado");
		entrada.close();
	}
}

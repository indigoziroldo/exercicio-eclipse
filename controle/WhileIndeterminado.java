package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		/* digite algo, pegue essa string
		somente quando o usuario digitar sair
		que vai quebrar o scanner
		letras maiusculas e minusculas devem ser ignoradas */
		
		Scanner entrada = new Scanner (System.in);
		
		String valor = "";
		
		//não sabemos quantas repetições serão, porém quando for true a condição vai parar o while
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("digite algo: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();

		
		
/* minha tentativa, funcionar funciono na gambiarra kk		
		System.out.println("digite qualquer coisa, me diga tchau quando quiser sair. ");
		
		String palavra = ""; 
		
		// condiçao para quebrar o while
		boolean tchau = palavra.equalsIgnoreCase("tchau");
		
		while (!tchau) {
			palavra = entrada.next();
			System.out.println(palavra);
			if(palavra.equalsIgnoreCase("tchau")) {
				entrada.close();
			}
		} 
*/		

	}
}

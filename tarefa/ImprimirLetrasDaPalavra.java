package tarefa;

import java.util.Scanner;

public class ImprimirLetrasDaPalavra {
	public static void main(String[] args) {
		/*8. Criar um programa que receba uma palavra,
		 * e imprime no console letra por letra.*/
		
		// scanner e inserir palavra
		Scanner entrada = new Scanner(System.in);
		System.out.print("diga sua palavra: ");
		String palavra = entrada.next();
		entrada.close();
		
		for (int i = 0; i <= palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
//			System.out.println("oi");
			
		}
		
	}

}

package tarefa;

import java.util.Scanner;

public class PositivosENegativosWhile {
	public static void main(String[] args) {
		/* 7. Criar um programa que enquanto estiver recebendo números positivos,
		 * imprime no console a soma dos números inseridos,
		 * caso receba um número negativo, encerre o programa.
		 * Tente utilizar a estrutura do while.*/
		
		Scanner entrada = new Scanner(System.in);

		int soma = 0;
		int numero = 0;

		while (numero >= 0) { // >= >= >= >= >=
			   System.out.println("diga um número inteiro ou use um negativo para sair ");
			   numero = entrada.nextInt();
			   if (numero >= 0) { // qualquer numero positivo vai entrar
			    soma += numero; // ele adiciona o numero a soma
			    System.out.printf("\nSoma até o momento: %d\n", soma);
			   }
			  }
		   entrada.close(); // manter essa coisa fora do while ou então ele quebra tudo
	}
}	
		
		/* Versão do professor
		   Scanner scanner = new Scanner(System.in);

  int somadorDeNumeros = 0;
  int numero = 0;

  while (numero >= 0) {
   System.out.println("Digite um numero inteiro (ou negativo para sair): ");
   numero = scanner.nextInt();
   if (numero >= 0) {
    somadorDeNumeros += numero; // Isso é igual a somadorDeNumeros = somadorDeNumeros + numero;
    System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
   }
  }
  scanner.close();
		 */
		
		/* Minha tentativa
		 Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("digite um número negativo para encerrar o programa");
		System.out.println("diga um numero: ");
		int numero = entrada.nextInt();
		int soma = 0;
		
		while(numero > 0) {
			soma +=numero;
			break;
		}
		
		System.out.println(soma);
		
		entrada.close();  */

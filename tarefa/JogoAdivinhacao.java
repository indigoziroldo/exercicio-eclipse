package tarefa;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
		public static void main(String[] args) {
			/* 6. Jogo da adivinhação:
			 * Tentar adivinhar um número entre 0 - 100.
			 * Armazene um numero aleatório em uma variável.
			 * O Jogador tem 10 tentativas para adivinhar o número gerado.
			 * Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
			 * e imprima se o número inserido é maior ou menor do que o número armazenado.
			 * PLUS: mostrar qual é o número pq a curiosidade ninguem aguenta*/
			
			// inserir scanner
			Scanner entrada = new Scanner(System.in);
			System.out.println("diga um número de 0 à 100: ");
			
			// criar o numero
			Random aleatorio = new Random();
			int numero = aleatorio.nextInt(100);
			
			// criar as 10 tentativas
			tentativas: for(int i = 10; i > 0 ; i--) {
				int aposta = entrada.nextInt();
				if(aposta == numero){
					System.out.println("você acertou!");
					break tentativas;
				}
				// aviso que as tentativas estão acabando
				System.out.printf("você ainda tem %d tentativas restantes\n", (i-1));
				// aviso se é maior ou menor que o numero
				if(aposta > numero) {
					System.out.println("Ixi apostou muito alto");
				} else System.out.println("Ixi apostou muito baixo");
			}
			
			System.out.println("O numero era: "+numero);

			entrada.close();
			
			
		}

}

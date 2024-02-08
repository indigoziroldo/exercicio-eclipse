package tarefa;

import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {
		/* 4. Criar um programa que receba um número e diga se ele é um número primo.*/
		
		int contagem = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int numero = entrada.nextInt();
		entrada.close();
		
		for (int i = 2; i < numero; i++) { // loop para verificar se o número é primo
			// vai dividindo o número e vendo se tem resto 0, ai aumenta o divisor e testando
			if (numero % i == 0) {
				contagem++;
			}
		}

		if (contagem == 0) { // boolean pra printar quando acabar o loop
			// verifica por boolean se o contador ainda for 0 é true e ai segue
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}
    }
}	
		
		/* Solução do professor
		 * 
		 * 		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}

		scanner.close();
		 * 
		 */
		
		
		/* Minha tentativa ;u;
		 * Scanner entrada = new Scanner(System.in);
		System.out.print("digite um numero para verificar se é primo: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		// para um numero ser primo ele precisa atender duas condições
		// 1) precisa ser divisivel apenas por 1 e por ele mesmo
		boolean primo = true; 
        for(int i = 2; i <= numero; i++) {

            for(int j = 2; j < i; j++) {            
                if(i % j == 0) {
                   primo = false;
                }
            }
        }
        if(primo) {
            System.out.println("é primo");*/

package tarefa;

import java.util.Scanner;

public class ValoresEMaior {
	public static void main(String[] args) {
		/*9. Crie um programa que recebe 10 valores
		 *  e ao final imprima o maior número. */
		
		Scanner entrada = new Scanner(System.in);
		int numeroMaior = 0;
		
		
		for(int i = 0; i <=10; i++) {
			
			System.out.print("digite um numero: ");
			
			int numero = entrada.nextInt();
			if(numeroMaior <= numero) {
				numeroMaior = 0;
				numeroMaior += numero;
			}
			
			System.out.printf("numero inserido: %d		 maior até agr: %d\n",numero,numeroMaior);
			
		}
		

		entrada.close();
		
		
	}}
	
	/* 2) tentativa	
		Scanner entrada = new Scanner(System.in);
		
		
		Integer maiorValor = 0;
		
		for (int contador =10; contador >= 1; contador--) {
			System.out.print("insira seu número: ");
			Integer valor = Integer.parseInt(entrada.next());
			while(valor > maiorValor) {
				maiorValor.equals(valor);
				System.out.printf("o valor é %d, o maior é %d\n",valor,maiorValor);
			}
		}
		entrada.close();
	}
}*/
		
		
/*	1) tentativa
 * 	for (int i = 10; i == 0; i--) {
			
			System.out.print("digite um valor: ");
			Integer valor = Integer.parseInt(entrada.next());
			
			while(valor > maiorValor) {
				maiorValor.equals(valor);
				System.out.println(maiorValor + valor);
				System.out.println("opa adicionei mais um número aqui... a soma é: "+maiorValor);
			}
		}
		
		System.out.println("o maior valor é: "+ maiorValor);
*/		

package tarefa;

import java.util.Scanner;

public class NumeroPrimoSwitch {
	public static void main(String[] args) {
		/*5. Refatorar o exercício 04, utilizando a estrutura switch.*/
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("diga seu número: ");
		int numero = entrada.nextInt();
		entrada.close();
		int contagem = 0;
		
		for(int i = 2; i < numero; i++) {
			
			if(numero % i == 0) {
				contagem++;
			}
		}
		
		switch (contagem) {
		case 0:
			System.out.println("é primo");
			break;
		default: System.out.println("não é primo");
				
		}
		
	}

}

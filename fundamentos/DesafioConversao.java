package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
	
		// criar scanner
		Scanner entrada = new Scanner(System.in);
		
		//criar 3 strings
		
		String salario1 = new String(entrada.nextLine());
		
		String salario2 = new String(entrada.nextLine());
		
		String salario3 = new String(entrada.nextLine());

		//fechar scanner
				entrada.close();
				
		//trocar virgula por ponto
		salario1 = salario1.replace(",", ".");
		salario2 = salario2.replace(",", ".");
		salario3 = salario3.replace(",", ".");
		
		// transformar de string pra double
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		// fazer a média
		
		double media = (valor1 + valor2 + valor3) / 3;
		
		System.out.println("A média é: "+media);
		
		
		
		
	}
}

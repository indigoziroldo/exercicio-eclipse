package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// ler num1
		//ler num 2
		// qual operação o usuario quer utilizar
		// fazer operação
		//mostrar o resultado
		
		//Ler os números
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Insira o número 1:");
		double numero1 = entrada.nextDouble();
		
		System.out.println("Insira o número 2:");
		double numero2 = entrada.nextDouble();
		
		System.out.println("Insira a operação:");
		String operacao = entrada.next();
		
		entrada.close();
		
		double resultado = "+".equals(operacao) ? numero1 + numero2 : 0;
		 resultado = "-".equals(operacao) ? numero1 - numero2 : resultado;
		 resultado = "*".equals(operacao) ? numero1 * numero2 : resultado;
		 resultado = "/".equals(operacao) ? numero1 / numero2 : resultado;
		 resultado = "%".equals(operacao) ? numero1 % numero2 : resultado;
		 
		 System.out.printf("%.2f %s %.2f = %.2f", numero1,operacao,numero2,resultado);
	/*	
		// criar as variaveis das operações
	
		String adicao = "+";
		String subtracao = "-";
		String multiplicacao = "*";
		String divisao = "/";
		
		// converter a string para a operacao
		
		int putaria = 0;
		int talvez = (operacao.equals("+")) ? numero1 + numero2 : (operacao.equals("-")) ? numero1 - numero2 :
			(operacao.equals("*")) ? numero1 * numero2 : (operacao.equals("/")) ? numero1 / numero2 :
				(operacao.equals("^")) ? (int) Math.pow(numero1, numero2) : putaria ;
		
		
		System.out.printf("%d %s %d = %d", numero1,operacao,numero2,talvez);
		*/
	}
}

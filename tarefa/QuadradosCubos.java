package tarefa;

import java.util.Scanner;

public class QuadradosCubos {
	public static void main(String[] args) {
		// criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor

		//scanear os valores
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("insira o valor que vc deseja ver ao quadrado e ao cubo: ");
		
		int valor = entrada.nextInt();
		
		entrada.close();
		
		// calculos
		
		int resultadoQuadrado = valor * valor;
		int resultadoCubo = valor * valor * valor;
		
		// print
		
		System.out.printf("O resultado do quadrado é %d, o resultado do cubo é %d", resultadoQuadrado, resultadoCubo);
		
	}

}

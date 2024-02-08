package tarefa;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		// criar um programa que leia o valor da base e da altura de um triângulo e calcule a área
		
		// scanner
		Scanner entrada = new Scanner(System.in);
		System.out.println("insira o valor da base: ");
		int base = entrada.nextInt();
		System.out.println("insira o valor da altura: ");
		int altura = entrada.nextInt();
		
		entrada.close();
		
		// calculos
		int resultado = (base * altura) / 2;
		
		// print
		
		System.out.println("o resultado da área é: "+resultado);
	}
}

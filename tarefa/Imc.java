package tarefa;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		// criar um programa que leia o peso e a altura do usuário e imprima no console o imc
		
		// ler os valores
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite seu peso: ");
		double peso = entrada.nextDouble();
		System.out.println("digite sua altura: ");
		double altura = entrada.nextDouble();
		
		entrada.close();
		
		// calculo do imc
		
		double resultado = peso / (altura * altura);
		
		// printar
		
		System.out.printf("O resultado do seu imc é %.2f", resultado);
		
		
	}
}

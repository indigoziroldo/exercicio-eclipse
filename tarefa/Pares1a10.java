package tarefa;

import java.util.Scanner;

public class Pares1a10 {
	public static void main(String[] args) {
		/* 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par; */
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("insira um número: ");
		int numero = entrada.nextInt();
		
		if(numero >= 1 && numero <= 10) {
			System.out.println("esse número está entre 1 e 10");
			if(numero %2 ==0) {
				System.out.println("esse número é par");
			}
			
		}

		entrada.close();
	}
}

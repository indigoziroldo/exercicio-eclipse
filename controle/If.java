package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("insira media:");
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7.0) {
			System.out.println("voce foi aprovado");
		}
		if (media < 7.0 && media >= 4.5) {
			System.out.println("voce está em recuperação");
		}
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		if (criterioReprovacao) {
			System.out.println("voce está reprovado");
		}
		
		
		entrada.close();
	}
}

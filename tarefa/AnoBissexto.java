package tarefa;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("qual ano vc deseja testar? ");
		int ano = entrada.nextInt();

		entrada.close();
		
		if (ano % 4 == 0) {
			System.out.println(ano+" esse ano é bissexto");
		} else System.out.println("não é bissexto");
	}
}

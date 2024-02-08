package tarefa;

import java.util.Scanner;

public class MediaNotasEConceito {
	public static void main(String[] args) {
		/* 3. Criar um programa que receba duas notas parciail e calcular a média final.
		 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
		 * se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
		 * caso contrário imprime no console "Reprovado".*/
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("por favor digite a primeira nota: ");
		int nota1 = entrada.nextInt();
		System.out.print("por favor digite a segunda nota: ");
		int nota2 = entrada.nextInt();
		
		entrada.close();
		
		int media = (nota1 + nota2) /2;
		System.out.println("a média é: "+media);
		
		if (media >= 7) {
			System.out.println("aprovado");
		} else if (media < 7 && media > 4) {
			System.out.println("recuperação");
		} else System.out.println("reprovado");
	}
}

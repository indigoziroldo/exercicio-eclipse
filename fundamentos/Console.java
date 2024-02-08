package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("abc");
		System.out.print("def"); // vai continuar imprimindo na mesma linha
		
		System.out.println("Bom"); //ainda printa na linha de cima MAS
		System.out.println("Dia!"); //printLN faz com que os prints vão cada um para uma linha diferente
		
		System.out.printf("Megasena: %d %d %d %d %d %n", 1, 2, 3, 4, 5); //print formatado usando uma string com caracteres
					//especiais aonde depois vc passa cada um dos valores
		System.out.printf("Salário: %.1f %n",1234.5678); //%.1f mostra apenas uma casa decimal e ainda vai arredondar para 6
				// printf também não tem quebra de linha automática
				// \n e %n funcionam como quebra de linha, pode escrever junto tbm
		System.out.printf("Nome: %s %n", "João"); // %s serve pra string
		
		// ctrl + space no "scanner" e ele importa e corrige a palavra
		// System.in é padrão para receber entrada pelo teclado
		Scanner entrada = new Scanner(System.in); // forma de declaração de uma variavel pelo scanner
		
		System.out.print("digite seu nome a seguir: ");
		String nome = entrada.nextLine(); //entrada.nextLine é como vai abrir pro teclado
		
		System.out.print("digite seu sobrenome a seguir: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("digite sua idade a seguir: ");
		int idade = entrada.nextInt(); //aqui mudamos pra uma inserção de um int
		// então fica nextInt
		// existe um next pra cada tipo de variável
//		System.out.println("\n\nNome: "+nome+" "+sobrenome+" você tem "+idade+" anos.");
		 //concatenou com os valores inseridos pelo teclado
		
		//quando se insere um nextLine depois do nextInt ou nextDouble
		// o nextInt/double não vai ler o space inserido e gerar a resposta pro próximo nextLine como espaço vazio
		// pra corrigir isso é preciso botar um "teclado.nextLine()" pra adquirir esse espaço vazio e não armazenar errado
		
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		// o método do scanner vai ficar rodando e precisa ser fechado, portanto
		entrada.close();
		
		
		
	}
}

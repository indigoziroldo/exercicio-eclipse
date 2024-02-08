package controle;

public class For2 {
	public static void main(String[] args) {
		/*criar um laço for decrescente
		e vai descrescendo de 2 em 2
		mostre o 0 e ai saia
		mostrar o contador e ir fazendo contagem decrescente
		 */
		
		System.out.print("insira o valor: ");
		for (int contador =10; contador >= 0; contador -=2) {
			System.out.printf("contador = %d\n",contador);
		}
		
	}
}

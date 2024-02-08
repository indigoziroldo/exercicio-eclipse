package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		/*media = valor / repeticoes;

		nota valida = 0 a 10
		recebeu invalida = pede pra repetir
		recebeu -1 saiu
		 */

		Scanner entrada = new Scanner(System.in);

		int valor = 0;
		int repeticoes = 0;
		int soma = 0;
		
		System.out.println("digite os valores:\n"+
		"escreva -1 para sair");
		
	/*	for (;valor >=11;) {
			System.out.println("valor inválido");
			valor=0;
			repeticoes=0;}
		
		while (!(valor == -1)) {
		
			valor = entrada.nextInt();
			soma += valor;
			repeticoes++;
		} 
	*/	
		
		while (!(valor == -1)) {
			valor = entrada.nextInt();
			if ((valor < 11)) {
			soma += valor;
			repeticoes++;}
			else {
				System.out.println("valor invalido");
			}
		}
		repeticoes--;
		int media = soma / repeticoes;
		System.out.println("o resultado da media é: "+media +" e a repeticao é "+repeticoes);
		
		
		entrada.close();
		
		
		
/*		do {
			System.out.println("diga as notas dos estudantes: ");
			valor = entrada.nextInt();
			repeticoes++;
		} while ((!(valor == -1)) && valor >= 0 && valor < 10);
		
		int media = valor / repeticoes;
		System.out.println(media);
		
*/
		
	}
}

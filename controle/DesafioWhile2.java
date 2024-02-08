package controle;

import java.util.Scanner;

public class DesafioWhile2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int qntdNotas =0;
		double nota=0;
		double total=0;
		
		while(nota != -1) {
			System.out.print("informe a nota ou -1 para sair: ");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <=10) {
			total += nota;
			qntdNotas++;
			} else if (nota != -1){System.out.println("valor invalido");}
		}
		
		//calcular a media
		double media =qntdNotas / total;
		System.out.println("media: "+media);
		

		entrada.close();
	}
}

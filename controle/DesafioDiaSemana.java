package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		// digitar o dia da semana e retornar de 1 a 7, usando if else
		
		//capturar a string
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Diga um dia da semana a seguir: ");
		String dia = entrada.next();
		
		entrada.close();
		
		// converter os acentos para letras normais
		dia = dia.replace("ç", "c");
		dia = dia.replace("á", "a");
		
		// converter os dias para upper
		dia = dia.toUpperCase();
		
		// cada dia corresponde a um número
		
		if ("SEGUNDA".equals(dia)) {
			System.out.println("1");
		} else if ("TERCA".equals(dia)){
			System.out.println("2");
		} else if ("QUARTA".equals(dia)){
			System.out.println("3");
		} else if ("QUINTA".equals(dia)){
			System.out.println("4");
		} else if ("SEXTA".equals(dia)){
			System.out.println("5");
		} else if ("SABADO".equals(dia)){
			System.out.println("6");
		} else if ("DOMINGO".equals(dia)){
			System.out.println("7");
		}
		
	}
}

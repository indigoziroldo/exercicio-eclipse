package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	public static void main(String[] args) {
		// trabalho na terça		(V ou F)
		// trabalho na quinta		(V ou F)
		/* Se os DOIS forem vdd, comprar tv de 50'
		 * Se apenas um der certo, comprar 32'
		 * Independente de qual, vcs vão tomar sorvete no shopping
		 * Se os dois derem errado ninguem faz nada
		 */
		
		//criar as variáveis
		
		boolean trabalhouTerca = true;
		boolean trabalhouQuinta = true;
		
		boolean deuMuitoBom = (trabalhouTerca && trabalhouQuinta);
		boolean deuMeioBom = (trabalhouTerca ^ trabalhouQuinta);
		boolean deuRuim = (!trabalhouTerca && trabalhouQuinta);
		boolean temSorveteHoje = (trabalhouTerca || trabalhouQuinta);
		
		// condições nos sysout
		
		System.out.println("comprou a tv de 50? " + deuMuitoBom);
		
		System.out.println("comprou a tv de 32? " + deuMeioBom);
		
		System.out.println("foi no shopping e pegou sorvete? " + temSorveteHoje);
		
		System.out.println("ficou em casa hoje? " + deuRuim);
		
	}
}

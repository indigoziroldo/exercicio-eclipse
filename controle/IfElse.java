package controle;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
//		String valor = JOptionPane.showImputDialog("oi");
		Scanner entrada = new Scanner(System.in);
		String valor = entrada.next();
		
		int numero = Integer.parseInt(valor);
		entrada.close();
		
		if (numero % 2 == 0) {
			System.out.println("par");
		} else { System.out.println("impar");}
		
	}
}


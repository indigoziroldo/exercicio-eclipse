package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		String s1 = new String("2");
		
		System.out.println("2" == s1); // embora o conteudo seja igual o java ve que são tipos diferentes
		System.out.println("2".equals(s1)); //equals serve pra testar se o conteudo de uma string é igual ao bagulho
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();
		
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim())); //trim tira os espaços em branco que o usuário pode inserir sem querer;
		
		entrada.close();
		
	}

}

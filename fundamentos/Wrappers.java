package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		// cada tipo primitivo tem uma classe com seu nome para permitir ser usado métodos
		Byte b = 100;
		Short s = 1000;
	//	Integer i = 10000; Classe do int
	//	Integer i = Integer.parseInt("10000"); //parseint transforma a string "1000" em int
		Integer i = Integer.parseInt(entrada.next()); //usa o next para pegar apenas um int
		// converte o valor inserido para integer
		
		Long l = 10000000L; //precisa do L no final
		
		// usando as classes dos tipos primitivos podemos usar os atributos, ex:
		
		System.out.println(b.byteValue()); // mostra o valor dentro da classe byte
		System.out.println(s.toString()); //transforma em string, apesar de ainda printar visualmente a mesma coisa
		System.out.println(i * 3); //por ter sido transformado de string pra integer podemos fazer relações algébricas
	//	System.out.println(l / 3); // dividir por valores inteiros retorna valores inteiros
		System.out.println(l / 3.0); //dividir por valores quebrados retorna valores quebrados
		
		Float f = 1234.1234F; //obrigatoriamente botar F com a letra
		System.out.println(f);

		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); //converte de string pra boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // converte primeiro pra string e dps pra uppercase
		//outra forma de transformar tipo boolean normal em string é concatenar com uma string vazia, ex:
	//	System.out.println((""+bo).toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c.toString());
		
		
		
		
		entrada.close();
		
		
	}
}

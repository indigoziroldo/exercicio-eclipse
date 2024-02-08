package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		// string é uma classe, cada valor associado a classe é um objeto
		String s = new String ("texto"); //praticidade em declarar e iniciar string
		// portanto quando se coloca s. vemos os múltiplos atributos a tal objeto
		s.toUpperCase();
		// .toUpperCase é um comportamento para o obj
		 int a = 123;
		 // os tipos primitivos não tem comportamentos igual a string pois eles não são objetos
		 // a opção é usar wrappers que irão dar a possibilidade de dar atributos como se fosse um obj
		
	}
}

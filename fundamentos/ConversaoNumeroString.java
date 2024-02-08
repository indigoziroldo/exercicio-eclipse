package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		//usando diretamente o tipo
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); //dps de transformar em string podemos usar os atributos de uma string
		// como por ex, o length
		
		//pra converter diretamente do tipo precisamos chamar sua classe e ai fazer o toString
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
	}
}

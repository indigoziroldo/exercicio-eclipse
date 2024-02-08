package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		// usando um valor literal, mesmo sem declarar variavel conseguimos chamar as funcionalidades da string
		System.out.println("Olá pessoal!".charAt(0)); // chatAt é achar o caracter na posição x
		
		String s = "Boa tarde";
	//	s = s.toUpperCase(); ta substituindo a string anterior por uma em uppercase, sem modificar o valor original
	//	s = "Bom dia"; substitui totalmente o valor sem sequer puxar o original
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa")); // será que a string inicia com "boa" //retorna boolean
									// upper and lower case sensitive
		System.out.println(s.length()); // qual o comprimento/ quantos caracteres //int
		// algumas funcionalidades retornam novas strings e outras retornam valores primitivos como int e boolean
		System.out.println(s.endsWith("tarde!")); //será que termina com "dia!" //case sensitive
		System.out.println(s.equals("boa tarde")); //compara com a sequencia escrita e retorna boolean
		System.out.println(s.equalsIgnoreCase("boa tarde")); // compara com a sequencia e ignora case sensitive
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 19;
		var salario = 123456.12465;
		
		System.out.println("nome: "+nome+"\n sobrenome: "+sobrenome+"\n idade:"+idade+"\n salario:"+salario); //cansativo
		System.out.printf("nome: %s %s, idade: %d, salario: %.2f", nome, sobrenome, idade, salario);
								// %s para string 	%d para inteiros	%f para double %.2f para mostrar 2 casas decimais
		
		String frase = String.format("nome: %s %s, idade: %d, salario: %.2f", nome, sobrenome, idade, salario);
			// concatena os valores recebidos e cria outra string
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual")); //sera que essa frase contem dentro dela o "qual"
		System.out.println("Frase qualquer".indexOf("qual")); //retorna a posição do que é mencionado
		System.out.println("Frase qualquer".substring(6)); // vai retornar tudo a partir da posição mencionada
		System.out.println("Frase qualquer".substring(6, 8)); // vai retornar da posição 6 a 7, o 8 não entra no  resultado
		
		
		
		
		
		
}
}

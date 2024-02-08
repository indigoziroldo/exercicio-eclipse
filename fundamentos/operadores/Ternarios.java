package fundamentos.operadores;

public class Ternarios {
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoFinal = media >= 7.0 ? "Aprovado" : "Reprovado";
		System.out.println("O aluno está: "+resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim" : "nao";
		
		
		// um operador ternário dentro do outro
	//	String resultado = media >= 7.0 ? "Aprovado" : media >= 5.0 ? "Recuperação" : "Reprovado";
		
		System.out.println("Tem desconto: " +resultado);
	}
}

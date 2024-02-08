package fundamentos.operadores;

public class DesafioAritmedicos {

	public static void main(String[] args) {
		
	/*	int a = 2 + 3 * 4;
		int b = (int) Math.pow(a, 3); //Math.pow faz a potenciação
		// resultado da elevação do power vai ser double por isso o cast em int
		
	*/
		//primeiro colchete
		int a = 3;
		int b = 2;
		int c = 6;
		
		int primeiroColchete = ((a + b) * c);
		
		//dividir primeiro colchete
		
		int divisaoA = 3;
		int divisaoB = 2;
			// junto com a potencializacao
		int divisaoPrimeiroColchete = (int) (Math.pow(primeiroColchete,2)) / (divisaoA * divisaoB);
		
		// segundo colchete
		int d = 1;
		int e = 5;
		int f = 2;
		int g = 7;
		
		int segundoColchete = ((d - e) * (f - g));
		
		//dividir segundo colchete
		
		int divisaoC = 2;
		
		int divisaoSegundoColchete = segundoColchete / divisaoC;
		
		// potenciacao do segundo colchete inteiro
		
		int potenciacaoSegundoColchete = (int) Math.pow(divisaoSegundoColchete, 2);
		
		// subtracao dos colchetes juntos
		
		int subtracaoColchetes = divisaoPrimeiroColchete - potenciacaoSegundoColchete;
		
		// potencializacao do resultado dos colchetes
		
		int potencializacaoSubtracao = (int) Math.pow(subtracaoColchetes,3);
		
		// ultima divisao e potencialização
		
		int divisaoD = 10;
		
		int divisaoFinal = (int) (potencializacaoSubtracao / Math.pow(divisaoD, 3));
		
		
		System.out.println(divisaoFinal);
		
		
	}
	
}

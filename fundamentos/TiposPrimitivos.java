package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informações do funcionário
		
		// tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 543;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		// o L no final do long é pra fazer reconhecer o numero como um tipo long
		
		//tipos numéricos reais - com ponto flutuante
		float salario = 11_445.44F;
		// mesma coisa do long, precisa colocar um F no final do numero
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano
		boolean estaDeFerias = false;
		
		// tipo caractere
		char status = 'A'; // ativo, char só aceita um simbolo por vez
		
		// dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganhará ->" + salario);
		
		System.out.println("Férias?" + estaDeFerias);
		
		System.out.println("Status :" + status);
	}
}

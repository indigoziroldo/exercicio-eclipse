package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		// if(boolean)....
		//while(boolean)...
		//for(;boolean;)...
		
		// é acumulativo, por isso se usa o switch invés das outras opções
		// se não tem break ele entra no primeiro case e faz todos os próximos também
		
		String faixa = "amarela";
		
		switch(faixa.toLowerCase()) {
		case"preta":
			System.out.println("Sei o Bassai-Dai...");
		case"marrom":
			System.out.println("Sei o Tekki Shodan...");
		case"roxa":
			System.out.println("Sei o Heian Godan...");
		case"verde":
			System.out.println("Sei o Heian Yodan...");
		case"laranja":
			System.out.println("Sei o Heian Sandan");
		case"vermelha":
			System.out.println("Sei o Heian Nidan");
		case"amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
				System.out.println("não sei nada");
		}
		System.out.println("fim!");
		
		int idade = 3;
		switch(idade) {
		case 3:
			System.out.println("sabe falar");
		case 2:
			System.out.println("sabe andar");
		case 1:
			System.out.println("sabe respirar");
		}
		
	}
}

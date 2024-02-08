package controle;

public class WhileDeterminado {
	public static void main(String[] args) {
		
		// é um while determinado pois através do contador conseguimos saber
		// a qtd. de vezes que irá repetir
		int contador = 0;
		while (contador <=20) {
			System.out.println("bom dia");
	//		contador++; Add 1 ao contador
			contador += 2; // Add o número em seguida ao contador
		}
	}

}

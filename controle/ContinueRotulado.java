package controle;

public class ContinueRotulado {
	public static void main(String[] args) {
		externo:
			for (int i = 0; i < 3; i++) { //nomeamor o laço
				for (int j = 0; j < 3; j++) {
					if(i==1) { // quando o resultado der 1
				//		break; // vai sair do laço interno
						continue externo; // vai sair do laço com o rotulo externo
					}
					System.out.printf("[%d %d] ", i, j);
				}
				System.out.println();
			}
			System.out.println("fim!");
	}
}

package controle;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 ==1) {
				continue; // sempre que for encontrado ele interrompe aquela repetição
			}
		System.out.println(i);
		
	}
		// o continue interrompe aquela repetição
		for (int i = 1; i <= 10; i++) {
			if (i ==5) continue; // quando chegar no 5 ele vai pular e ir pro próx numero
			System.out.println(i);
			
		}

}
}

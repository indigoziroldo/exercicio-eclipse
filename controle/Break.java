package controle;

import java.util.Iterator;

public class Break {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if(i == 5) {
				break;
			
			}
			System.out.println(i);
		}
		
		System.out.println("fim!");
	}
}

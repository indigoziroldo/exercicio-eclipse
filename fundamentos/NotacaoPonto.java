package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		double a = 2.3;
		String s = "Bom Dia X";
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		
		System.out.println(s);
		String x = "Leo".toUpperCase();
		System.out.println(x);
		// é possível quebrar o ponto na linha subjacente
		// os pontos ajudam a concatenar vários métodos em sequência
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// tipos primitivos não tem operador "."
		
	}
}

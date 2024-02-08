package fundamentos;

public class CalculoTemperaturaCelsius {

	public static void main(String[] args) {
		// (Fº - 32) * 5/9 = celsius
	int fahrenheit = 68;
	final double NUMERO1 = 32;
	final double NUMERO2 = 5/9.0;
	
	double celsius = (fahrenheit - NUMERO1) * NUMERO2;
	
	System.out.println("o valor em celsius é: " + celsius);
	
		
	}
}

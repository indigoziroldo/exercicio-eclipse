package tarefa;

public class Bhaskara {
	public static void main(String[] args) {
		/* criar um program que resolve equações do segundo grau 
		 * (ax2 +bx + c = 0) utilizando a fórmula de bhaskara.
		 *  use como exemplo a=1, b=12, c =-13. encontre o delta
		 */
		
		// valores
		
		int a = 1;
		int b = 12;
		int c = -13;
		
		// calculo
		
		int delta = (b*b) - (4*a*c);
		
		// print
		
		System.out.println("o delta é: "+ delta);

}}

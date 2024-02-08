package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		//c = c + b; é a mesma coisa que:
		c += b; // atribuição aditiva
		// significa que estou acrescentando o valor de b ao c
		c -= b; //atribuição subtrativa
		c *= b; // c = c * b 	atribuição multiplicativa
		c /= b; // atribuição divisiva
		
		c++; // c = c + 1;
		
		c %= 2; // operador módulo
		// quero saber se é par ou impar, se der 0 significa que é par, se der 1 significa que é impar
		// c = c % 2;
	}
}

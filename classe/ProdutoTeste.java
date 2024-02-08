package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook",4356.89);
	//	passamos todos os valores por parametro 
		
		var p2 = new Produto("Caneta Preta",12.56);
	//	p2.nome = "Caneta Preta";
	//	p2.preco = 12.56;
	//	p2.DESCONTO = 0.29;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1); // ele vai para o método que tem atributos double
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Media do carrinho = %.2f", mediaCarrinho);
		System.out.println("\n"+precoFinal1);
		System.out.println("\n"+precoFinal2);
		
	}
}

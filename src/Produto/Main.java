package Produto;

public class Main {

	public static void main(String[] args) {
		EstoqueProduto ep = new EstoqueProduto();
		
		ep.cadastrar("notebook", 2,1.877);
		ep.exibirEstoque();
		ep.removerQuantidade(1);
		ep.exibirEstoque();

	}

}

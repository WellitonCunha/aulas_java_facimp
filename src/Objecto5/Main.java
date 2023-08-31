package Objecto5;

public class Main {

	public static void main(String[] args) {
		Produto produto = new Produto(32.56,"Teclado",1);
		produto.exibirInformacoes();
		produto.adicionarProdutos(10);
		produto.exibirInformacoes();
		produto.removerProdutos(4);
		produto.exibirInformacoes();
		produto.totalValorEmEstoque();

	}

}

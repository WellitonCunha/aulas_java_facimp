package Objeto3;

public class Main {

	public static void main(String[] args) {
		Produto produto = new Produto(36.55,"Mouse");
		produto.exibirInformacoes();
		produto.adcionarProdutos(5);
		produto.exibirInformacoes();
		produto.adcionarProdutos(2);
		produto.exibirInformacoes();
		produto.removerProdutos(3);
		produto.exibirInformacoes();
	}

}

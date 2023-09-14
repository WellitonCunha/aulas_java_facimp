package Produto;

public class EstoqueProduto {
	private String descricao;
	private int quantidade;
	private double valor;
	
	public EstoqueProduto() {
		quantidade = 0;
	}
	
	public void cadastrar(String descricao, int quantidade, double valor) {
		this.descricao = descricao;
		this.quantidade += quantidade;
		this.valor = valor;
	}
	
	public void removerQuantidade(int quantidade) {
		this.quantidade -=quantidade;
	}
	
	public void exibirEstoque() {
		System.out.println("Produto: "+descricao);
		System.out.println("Quantidade: "+quantidade);
		System.out.println("Vl. Unidade: "+valor);
		System.out.println("Valor Total: "+quantidade*valor);
	}
}

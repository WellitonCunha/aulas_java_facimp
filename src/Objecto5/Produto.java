package Objecto5;

public class Produto {
	private double valor;
	private String nome;
	private int quantidade;
	
	public Produto(double valor, String nome, int quantidade) {
		this.valor = valor;
		this.nome = nome;
		this.quantidade = quantidade;
	}
	
	public double totalValorEmEstoque() {
		return quantidade * valor;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade +=quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public void exibirInformacoes() {
		System.out.println("Valor: "+valor);
		System.out.println("Nome: "+nome);
		System.out.println("Quantidade: "+quantidade);
		System.out.println("Total: "+totalValorEmEstoque());
	}
}

package Abstracao;

public class Cartao extends FormaDePagamento {
	private String numeroCartao;
	
	public Cartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
	void efetuarPagamento(double valor) {
		System.out.println("Pagamento efetuado com o cartao: "+numeroCartao+" com o valor: "+valor);
	}
}

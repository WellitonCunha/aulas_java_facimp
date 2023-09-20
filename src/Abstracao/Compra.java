package Abstracao;

public class Compra {
	private double valorTotal;
    private FormaDePagamento metodoDePagamento;
    
    public Compra(double valorTotal, FormaDePagamento metodoDePagamento) {
        this.valorTotal = valorTotal;
        this.metodoDePagamento = metodoDePagamento;
    }
    
    public void realizarPagamento() {
        metodoDePagamento.efetuarPagamento(valorTotal);
    }
}

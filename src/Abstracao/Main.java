package Abstracao;

public class Main {

	public static void main(String[] args) {
		
		Dinheiro pagamentoEmDinheiro = new Dinheiro();
        Compra compra1 = new Compra(100.0, pagamentoEmDinheiro);
        compra1.realizarPagamento();
        
        Cartao pagamentoComCartao = new Cartao("1234-5678-9012-3456");
        Compra compra2 = new Compra(200.0, pagamentoComCartao);
        compra2.realizarPagamento();

	}

}

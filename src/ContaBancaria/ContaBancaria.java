package ContaBancaria;

public class ContaBancaria {
	private String titular;
	private String agencia;
	private String conta;
	private double saldo, valor;
	
	public ContaBancaria() {
		saldo = 0;
	}
	
	public void depositar(String titular, String agencia, 
						  String conta, double valor) {
		this.titular = titular;
		this.agencia = agencia;
		this.conta = conta;
		this.valor = valor;
		saldo += valor;
		System.out.println();
		extratoDeposito();
	}
	public void extratoDeposito() {
		System.out.println("---- Extrato de Deposito ----");
		System.out.println("---- Titular: "+titular);
		System.out.println("---- Agência: "+agencia);
		System.out.println("---- Conta: "+conta);
		System.out.println("---- Valor: "+valor);
		System.out.printf("---- Saldo Total: %.2f \n",saldo);
	}
	
	public void sacar(double valor) {
		saldo -= valor;
		System.out.println();
		System.out.println("---- Saque Bancário ----");
		System.out.printf("---- valor: %.2f \n",valor);
		System.out.printf("---- saldo: %.2f \n",saldo);
	}
}

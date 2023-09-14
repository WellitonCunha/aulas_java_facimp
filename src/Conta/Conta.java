package Conta;

public class Conta {
	private String agencia;
	private String conta;
	private String titular;
	private double saldo;
	
	public Conta() {
		saldo = 0;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}

	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void exibirInformacoes() {
		System.out.println("Titular: "+titular);
		System.out.println("Conta: "+conta);
		System.out.println("Conta: "+agencia);
		System.out.println("Saldo: "+saldo);
	}
}

package ContaBanc;

public class Conta {
	private String agencia;
	private String conta;
	private String titular;
	private double saldo;
	
	public Conta() {
		saldo = 0;
	}
	
	public void setDepositar(String agencia, String conta, String titular, double valor) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		saldo += valor;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getConta() {
		return conta;
	}


	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
}

package Conta;

public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setAgencia("1046-4");
		conta.setConta("1001745-9");
		conta.setTitular("Welliton");
		conta.depositar(100);
		
		conta.exibirInformacoes();

	}

}

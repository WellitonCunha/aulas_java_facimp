package ContaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta_bancaria = new ContaBancaria();
		conta_bancaria.depositar("Welliton Cunha", "1046-4", "1001745-9", 100);
		conta_bancaria.depositar("Welliton Cunha", "1046-4", "1001745-9", 37.80);
		conta_bancaria.depositar("Welliton Cunha", "1046-4", "1001745-9", 268.22);
		conta_bancaria.sacar(6.02);

	}

}

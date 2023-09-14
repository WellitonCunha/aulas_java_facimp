package ContaBanc;

public class Main {

	public static void main(String[] args) {
		Conta c = new Conta();
		
		c.setDepositar("1046-4", "1001745-9", "Welliton Cunha", 244);
		String ag = c.getAgencia();
		String conta =c.getConta();
		double saldo = c.getSaldo();
		String titular = c.getTitular();
		
		System.out.println("Tutlar: "+titular);
		System.out.println("conta: "+conta);
		System.out.println("agencia: "+ag);
		System.out.println("saldo: "+saldo);
		
		c.setDepositar("1046-4", "1001745-9", "Welliton Cunha", 57.88);
		
		System.out.println("Tutlar: "+titular);
		System.out.println("conta: "+conta);
		System.out.println("agencia: "+ag);
		System.out.println("saldo: "+saldo);
		
		

	}

}

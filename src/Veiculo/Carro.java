package Veiculo;

public class Carro extends Veiculo {
	private String porta;
	private String bagageiro;
	private String parabrisa;
	
	public Carro(String modelo, int ano, String cor, String marca,
			String porta, String bagageiro, String parabrisa) {
		super(modelo, ano, cor, marca);
		this.porta = porta;
		this.bagageiro = bagageiro;
		this.parabrisa = parabrisa;
	}
	
	
	
	public String getPorta() {
		return porta;
	}



	public String getBagageiro() {
		return bagageiro;
	}




	public String getParabrisa() {
		return parabrisa;
	}



	public void arcondionado() { 
		System.out.println("arcondionado...");
	}
	
}

package Veiculo;

public class Moto extends Veiculo {
	private String tripe;
	private String guidon;
	
	public Moto(String modelo, int ano, String cor, String marca,
			String tripe, String guidon) {
			super(modelo, ano, cor, marca);
			this.tripe = tripe;
			this.guidon = guidon;
	}

	public String getTripe() {
		return tripe;
	}

	public String getGuidon() {
		return guidon;
	}

}

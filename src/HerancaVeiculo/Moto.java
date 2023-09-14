package HerancaVeiculo;

public class Moto extends Veiculo {
	private String triper;
	private String apoioPe;
	private String guidon;
	
	public Moto(String modelo, int ano, String placa,
			String marca, String cor,
			String triper, String apoioPe, String guidon) {
		super(modelo, ano, placa, marca, cor);
		this.triper = triper;
		this.apoioPe = apoioPe;
		this.guidon = guidon;
	}

	public String getTriper() {
		return triper;
	}

	public String getApoioPe() {
		return apoioPe;
	}

	public String getGuidon() {
		return guidon;
	}
	
}

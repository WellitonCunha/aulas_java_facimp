package HerancaVeiculo;

public class Carro extends Veiculo {
	private boolean volante;
	private boolean parabrisa;
	private boolean arcondicionado;
	
	public Carro(String modelo, int ano, String placa,
			String marca, String cor, 
			boolean volante, boolean parabrisa, boolean ardicionado) {
		super(modelo, ano, placa, marca, cor);
		this.volante = volante;
		this.parabrisa = parabrisa;
		this.arcondicionado = arcondicionado;
	}
	
	
	
	public boolean isVolante() {
		return volante;
	}



	public boolean isParabrisa() {
		return parabrisa;
	}



	public boolean isArcondicionado() {
		return arcondicionado;
	}



	public void andarRe() {
		System.out.println("Andar de rê...");
	}
}

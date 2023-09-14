package HerancaVeiculo;

public class Veiculo {
	private String modelo;
	private int ano;
	private String placa;
	private String marca;
	private String cor;
	
	public Veiculo(String modelo, int ano, String placa,
			String marca, String cor) {
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.marca = marca;
		this.cor = cor;
	}
	
	
	
	public String getModelo() {
		return modelo;
	}



	public int getAno() {
		return ano;
	}



	public String getPlaca() {
		return placa;
	}



	public String getMarca() {
		return marca;
	}



	public String getCor() {
		return cor;
	}



	public void acelerar() {
		System.out.println("Acelerar...");
	}
	
	public void frear() {
		System.out.println("Frear...");
	}
}

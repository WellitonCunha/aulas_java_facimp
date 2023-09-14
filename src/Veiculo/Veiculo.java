package Veiculo;

public class Veiculo {
	private String modelo;
	private int ano;
	private String cor;
	private String marca;
	
	public Veiculo(String modelo, int ano, String cor, String marca) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}


	public String getCor() {
		return cor;
	}

	public String getMarca() {
		return marca;
	}
	
	public void acelerar() {
		System.out.println("Acelerar...");
	}
	
	public void frear() {
		System.out.println("Frear...");
	}
}

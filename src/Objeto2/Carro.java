package Objeto2;

public class Carro {
	// atributos
	private String modelo;
	private String marca;
	private int ano;
	private String cor;
	private double velocidade;
	
	// construtor
	public Carro(String modelo, String marca, int ano,String cor) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.cor = cor;
		velocidade = 0;
	}
	
	//metodos - comportamentos
	public double acelerar(double velocidade) {
		return this.velocidade += velocidade;
	}
	
	//metodos - comportamentos
	public double frear(double velocidade) {
		return this.velocidade -= velocidade;
	}
	
	//metodos - comportamentos
	public void exibirInformacoes() {
		System.out.println("Modelo: "+modelo);
		System.out.println("Marca: "+marca);
		System.out.println("ano: "+ano);
		System.out.println("Cor: "+cor);
		System.out.println("Velocidade: "+velocidade);
	}
	
	
}

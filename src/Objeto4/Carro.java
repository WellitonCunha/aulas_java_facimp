package Objeto4;

public class Carro {
	// atributos
	String modelo;
	String marca;
	int ano;
	String cor;
	String placa;
	double velocidade;
	
	// construtor
	public Carro(String modelo, String marca, int ano, String placa) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		velocidade = 0;
	}
				
	// metodo - comportamento
	public double frear(double velocidade) {
		return this.velocidade -= velocidade;
	}
	
	// metodo - comportamento
	public double acelerar(double velocidade) {
		return this.velocidade += velocidade;
	}
	
	//metodo - comportamento
	public void exibirInformacoes() {
		System.out.println("Modelo: "+modelo);
		System.out.println("Marca: "+marca);
		System.out.println("Ano: "+ano);
		System.out.println("Placa: "+placa);
		System.out.println("Velocidade: "+velocidade);
	}
	
}

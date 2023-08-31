package Exercicio4;

public class Carro {
	// atributos 
	// modificadores de acesso
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private double velocidade;
	
	// construtor
	public Carro(String marca, String modelo, int ano, String cor){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.velocidade = 0;
	}
	
	// metodos - comportamentos	
	public double acelerar(double velocidade){
		return this.velocidade += velocidade;
	}
	
	// metodos - comportamentos
	public double frear(double velocidade){
		return this.velocidade -= velocidade;
	}
	
	public void exibirInformacoes(){
		System.out.println("marca: "+this.marca);
		System.out.println("modelo: "+this.modelo);
		System.out.println("cor: "+this.cor);
		System.out.println("ano: "+this.ano);
		System.out.println("velocidade: "+this.velocidade);
	}
	
	
}

package objeto;

public class Carro {
	private String marca;
	private String cor;
	private int ano;
	private float velocidade;
	
	public Carro(String marca, String cor, int ano) {
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
		this.velocidade = 0;
	}
	
	public void acelerar(float velocidade) {
		this.velocidade += velocidade;
	}
	
	public void frear(float velocidade) {
		this.velocidade -= velocidade;
	}
	
	public void exibirInformacoes() {
		System.out.println("Marca: "+marca);
		System.out.println("Ano: "+ano);
		System.out.println("cor: "+cor);
		System.out.println("Velocidade: "+velocidade+" km/h ");
	}

}

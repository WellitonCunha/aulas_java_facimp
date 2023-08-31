package Objeto2;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("hatch","chevrolet",2020,"Branco");
		carro.acelerar(55.80);
		carro.exibirInformacoes();
		carro.frear(33.80);
		carro.exibirInformacoes();

	}

}

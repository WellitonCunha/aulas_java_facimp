package Exercicio4;

public class Main {

	public static void main(String[] args) {
		// criando um objeto do tipo carro
		// instanciando um objeto do tipo Carro
		Carro carro = new Carro("Chevrolet", "hatch", 2020, "Branco");
		
		carro.acelerar(55.77);
		carro.exibirInformacoes();
		carro.frear(33.00);
		carro.exibirInformacoes();
	}

}

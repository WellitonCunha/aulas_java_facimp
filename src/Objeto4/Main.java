package Objeto4;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Onix Hatch","Chevrolet",2020,"HGGK-22");
		carro.exibirInformacoes();
		carro.acelerar(44.99);
		carro.exibirInformacoes();
		carro.frear(10.99);
		carro.exibirInformacoes();
	}

}

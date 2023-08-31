package objeto;

public class principal {

	public static void main(String[] args) {
		Carro carro = new Carro("Chevrolet","Branco",2020);
		
		carro.acelerar(56);
		carro.exibirInformacoes();
		carro.frear(34);
		carro.exibirInformacoes();

	}

}

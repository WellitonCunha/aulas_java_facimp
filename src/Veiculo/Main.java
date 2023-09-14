package Veiculo;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Onix", 2020, "Branco", "Chevrolet", "4", "1", "1");
		Moto moto = new Moto("CB650",2023,"Vermelha","Honda","sim","sim");
		
		System.out.println("Modelo: "+carro.getModelo());
		System.out.println("Modelo: "+moto.getModelo());
	}

}

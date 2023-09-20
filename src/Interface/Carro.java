package Interface;

public class Carro implements Veiculo {

	@Override
	public void acelerar() {
		System.out.println("Carro acelera..");
		
	}

	@Override
	public void frear() {
		System.out.println("Carro frea..");
		
	}

	@Override
	public void buzinar() {
		System.out.println("Carro buzina..");
		
	}
	
}

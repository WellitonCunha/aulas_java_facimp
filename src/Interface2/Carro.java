package Interface2;

public class Carro implements Veiculo {

	@Override
	public void acelerar() {
		System.out.println("Acelerar...");
		
	}

	@Override
	public void frear() {
		System.out.println("Frear...");
		
	}

	@Override
	public void buzinar() {
		System.out.println("Buzinar...");
		
	}

}

package ClasseAbstrata;

public class Gato extends Animal {
	
	@Override
	public void fazerSom() {
		System.out.println("Gato mia...");
	}
	
	@Override
	public void comer() {
		System.out.println("Gato come...");
	}
	
	@Override
	public void dormir() {
		System.out.println("Dormir...");
	}
}

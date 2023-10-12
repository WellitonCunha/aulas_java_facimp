package Estatico;

public class Principal {

	public static void main(String[] args) {
		Principal principal = new Principal();
		try {
			System.out.println(principal.calcular(10,0));
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu uma exceção: "+e.getMessage());
		}
			
		System.out.println("Sistema continua...");
		
	}
	
	public double calcular(int x, int y) {
		return x / y;
	}

}

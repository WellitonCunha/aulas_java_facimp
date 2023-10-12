package Excecao;

public class Main {

	public static void main(String[] args) throws MinhaExcecao {
//		if (1 > 2){
//			System.out.println("1 maior que 2");
//		}else {
//			throw new MinhaExcecao("Minha exceção");
//		}
		try {
			double x = 1.5;
			int y = 2;
			System.out.println(x+y);
		} catch (Exception e) {
			System.out.println("Minha exceção"+e.getMessage());
		}
		

	}

}

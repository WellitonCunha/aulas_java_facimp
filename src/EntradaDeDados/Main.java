package EntradaDeDados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String valor;
		int x;
		double y;
		char s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		sc.nextLine();
		s = sc.next().charAt(0);
		System.out.println("Valor digitado é = "+s);
		sc.close();

	}

}

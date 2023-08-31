package Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String senha = "123abc";
		
		while(true) {
			System.out.print("Digite sua senha: ");
			String pw = sc.nextLine();
			
			if (pw.equals(senha)) {
				System.out.println("Senha correta");
				break;
			}else {
				System.out.println("Senha inválida");
			}
		}
		
		sc.close();

	}

}

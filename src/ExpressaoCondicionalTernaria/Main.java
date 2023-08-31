package ExpressaoCondicionalTernaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String condicao;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu Sexo? ");
		char sexo = sc.next().charAt(0);
		condicao = sexo == 'm'?  "Masculino":"Feminino"; 
		System.out.println("Seu sexo é "+condicao);
		sc.close();

	}

}

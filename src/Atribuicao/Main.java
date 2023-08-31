package Atribuicao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double mensal = 50.00;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as horas?");
		double valor = sc.nextInt();
	
		if(valor<=100) {
			System.out.println("Valor total a pagar: "+mensal);
		}else {
			mensal += (valor-100)*2.00;
			System.out.println("Valor total a pagar: "+mensal);
		}
		sc.close();
	}

}

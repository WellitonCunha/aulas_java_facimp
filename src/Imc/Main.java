package Imc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double imc;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu peso? ");
		double peso = sc.nextDouble();
		
		System.out.println("Informe sua altura?");
		double altura = sc.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc <= 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc <= 24.9 ) {
			System.out.println("Peso normal");
		} else if (imc <= 29.9) {
			System.out.println("Sobrepeso");
		}else if (imc <= 34.99) {
			System.out.println("Obesidade Grau I");
		}else if (imc <= 39.99) {
			System.out.println("Obesidade Grau II");
		}else {
			System.out.println("Obesidade Grau III");
		}
		
		sc.close();

	}

}

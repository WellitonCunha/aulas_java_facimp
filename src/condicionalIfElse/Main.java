package condicionalIfElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double imc;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu peso: ");
		double peso = sc.nextDouble();
		System.out.println("Informe sua altura: ");
		double altura = sc.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc <= 18.5) {
			System.out.println("Abaixo do peso: "+imc);
		}else if(imc <= 24.9){
			System.out.println("Peso normal: "+imc);
		}else if(imc <= 29.9) {
			System.out.println("Sobre peso: "+imc);
		}else if (imc <= 34.99) {
			System.out.println("Obsidade grau I: "+imc);
		}else if (imc <= 39.99) {
			System.out.println("Obsidade grau II: "+imc);
		}else {
			System.out.println("Obsidade grau III: "+imc);
		}
		
		// operador lógico
		// && operador E
		// | operador OR
		// ! operador de Negação

	}

}

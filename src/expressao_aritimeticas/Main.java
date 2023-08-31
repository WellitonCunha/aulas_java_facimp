package expressao_aritimeticas;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int a = 5;
		int idade = 31;
		String nome = "Welliton";
		char sexo = 'M';
		double salario = 8567.8833; 
		double valor = 523.4456;
		System.out.println("Adição: 5+5 = "+(5+5));
		System.out.println("Subtração: 5-5 = "+(5-5));
		System.out.println("Multiplicaçã: 5*5 = "+(5*5));
		System.out.println("Divisão: 5/5 = "+(5/5));
		System.out.println("Resto da Divisão: 5%5 = "+(5%5));
		System.out.println("Sinal negativo: -5 = "+(-5));
		System.out.println("Sinal Positivo: +5 = "+(+5));
		System.out.println("Inclemento: ++5 = "+(++a));
		System.out.println("Declemento: --5 = "+(--a));
		System.out.printf("valor : %.2f \n",valor);
		Locale.setDefault(Locale.US);
		System.out.printf("Nome %s idade %d sexo %c com salário de %.2f",nome,idade,sexo,salario);
		
	}

}

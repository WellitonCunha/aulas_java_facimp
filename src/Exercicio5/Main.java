package Exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe seu salário bruto: ");
		double salarioBruto = sc.nextDouble();
		System.out.println("Informe seu imposto: ");
		double imposto = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome,salarioBruto, imposto);
		
		double salarioLiquito = funcionario.salarioLiquido();
		
		System.out.println("nome: "+nome);
		System.out.println("Salario Liquido: "+salarioLiquito);
		
		System.out.println("Informe a % do aumento: ");
		double aumento = sc.nextDouble();
		
		funcionario.calcularAumento(aumento);
		
		
		

	}

}

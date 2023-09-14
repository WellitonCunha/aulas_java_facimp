package Exercicio5;

public class Funcionario {
	String nome;
	double salarioBruto;
	double imposto;
	
	public Funcionario(String nome, double salarioBruto, double imposto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void calcularAumento(double porcentagem) {
		double total = salarioLiquido() + (salarioLiquido() * porcentagem)/100;
		System.out.println("Dados atualizados: "+nome+" $ "+total);
	}
}

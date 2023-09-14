package Encapsulamento;

public class Pessoa {
	private String nome;
	private int idade;
	private String cpf;
	private char sexo;
	private double salario;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Cpf: "+cpf);
		System.out.println("Sexo: "+sexo);
		System.out.println("Salario: "+salario);
	}
	
	
	
}

package Heranca;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private String rg;
	
	public Pessoa(String nome, String cpf, int idade, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void andar() {
		System.out.println("Andar...");
	}
	
	public void comer() {
		System.out.println("comer...");
	}
	

}

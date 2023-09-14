package Herenca;

public class Pessoa {
	private String nome;
	private String cpf;
	private String email;
	private int idade;
	
	public Pessoa(String nome, String cpf, String email, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public int getIdade() {
		return idade;
	}

	public void falar() {
		System.out.println("Falar...");
	}
	
	public void andar() {
		System.out.println("Andar...");
	}
}

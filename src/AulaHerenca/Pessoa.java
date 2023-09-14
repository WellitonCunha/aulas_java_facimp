package AulaHerenca;

public class Pessoa {
	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	
	public Pessoa(String nome, String cpf, 
		   String rg, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void andar() {
		System.out.println("Andar..");
	}
	
	public void falar() {
		System.out.println("Falar..");
	}
}

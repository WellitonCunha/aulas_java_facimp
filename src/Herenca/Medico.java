package Herenca;

public class Medico extends Pessoa {
	private String crm;
	private String especializacao;
	public Medico(String nome, String cpf, String email, int idade,
			String crm, String especializacao) {
		super(nome, cpf, email, idade);
		this.crm = crm;
		this.especializacao = especializacao;
	}
	
	public String getCrm() {
		return crm;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void realizaConsulta() {
		System.out.println("Médico faz consultas");
	}
	
	public void prescreveRemedio() {
		System.out.println("Prescreve Remédios");
	}
	
	
}

package Heranca;

public class Medico extends Pessoa {
	private String crm;
	private String especialidade;
	
	public Medico(String nome, String cpf, int idade, 
			String rg,
			String crm, String especialidade) {
		super(nome, cpf, idade, rg);
		this.crm = crm;
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void realizaReceita() {
		System.out.println("Realiza Receita médica..");
	}
	
	public void realizarConsulta() {
		System.out.println("Realiza consulta..");
	}
}

package AulaHerenca;

public class Medico extends Pessoa {
	private String crm;
	private String especializacao;
	
	public Medico(String nome, String cpf, 
			   String rg, String dataNascimento, 
			   String crm, String especializacao) {
		// preenchendo as informações do construtor da classe Pessoa
		super(nome,cpf,rg,dataNascimento);
		this.crm = crm;
		this.especializacao = especializacao;
	}
	
	
	
	public String getCrm() {
		return crm;
	}



	public String getEspecializacao() {
		return especializacao;
	}



	public void cirurgia() {
		System.out.println("Cirurgia...");
	}
	
	public void consulta() {
		System.out.println("Consulta...");
	}
}

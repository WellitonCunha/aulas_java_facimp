package Herenca;

public class Main {

	public static void main(String[] args) {
		Medico medico = new Medico("Welliton","123123","weliton",31,
				"123123","Cardiologista");
		
		String nome = medico.getNome();
		String cpf = medico.getCpf();
		String email = medico.getEmail();
		int idade = medico.getIdade();
		String crm = medico.getCrm();
		String especializacao = medico.getEspecializacao();
		
		System.out.println("Nome: "+nome);
		System.out.println("Cpf: "+cpf);
		System.out.println("Email: "+email);
		System.out.println("Idade: "+idade);
		System.out.println("Crm: "+crm);
		System.out.println("Especializacao: "+especializacao);
		
		medico.andar();
		medico.falar();
		medico.prescreveRemedio();
		

	}

}

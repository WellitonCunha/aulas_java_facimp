package Heranca;

public class Main {

	public static void main(String[] args) {
		
		Medico medico = new Medico("Welliton","123123",31,"12312354","7788CT","Cardiologista");
		
		String nome = medico.getNome();
		String cpf = medico.getCpf();
		int idade = medico.getIdade();
		String rg = medico.getRg();
		String crm = medico.getCrm();
		String especialidade = medico.getEspecialidade();
		
		System.out.println("Nome: "+nome);
		System.out.println("Cpf: "+cpf);
		System.out.println("Idade: "+idade);
		System.out.println("Rg: "+rg);
		System.out.println("Crm: "+crm);
		System.out.println("Especialidade: "+especialidade);
		
		medico.andar();
		medico.comer();
		
		medico.realizaReceita();
		medico.realizarConsulta();
	}

}

package AulaHerenca;

public class Main {

	public static void main(String[] args) {
		Medico medico = new Medico("Welliton","123123","7654545",
				"29/03/1992","PH2356","Cardiologista");
		
		System.out.println("Nome: "+medico.getNome());
		System.out.println("Cpf: "+medico.getCpf());
		System.out.println("RG: "+medico.getRg());
		System.out.println("Data Nascimento: "+medico.getDataNascimento());
		System.out.println("Crm: "+medico.getCrm());
		System.out.println("Especializacao: "+medico.getEspecializacao());
		
		medico.andar();
		medico.cirurgia();
		medico.consulta();
		medico.falar();

	}

}

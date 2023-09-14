package Encapsulamento2;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setNome("Welliton");
		p.setCpf("198372198");
		p.setIdade(31);
		String nome = p.getNome();
		String cpf = p.getCpf();
		System.out.println("Nome: "+nome);
		System.out.println("Cpf: "+cpf);
		

	}

}

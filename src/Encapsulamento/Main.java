package Encapsulamento;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Welliton");
		pessoa.setIdade(31);
		pessoa.setCpf("123123");
		pessoa.setSexo('M');
		pessoa.setSalario(30.0000);
		
		pessoa.exibirInformacoes();
	}

}

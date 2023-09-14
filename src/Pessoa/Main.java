package Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setNome("Welliton");
		p.setCpf("132123");
		p.setIdade(31);
		p.setEmail("welliton@live.com");
		
		System.out.println(p.getNome());
		System.out.println(p.getCpf());
		System.out.println(p.getIdade());
		System.out.println(p.getEmail());

	}

}

package HerancaVeiculo;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Hatch",2023,
				"XGT-8876","BMW","Branco",true,true,false);
		
		System.out.println("Modelo: "+carro.getMarca());
		carro.acelerar();
		carro.frear();
		
		Moto moto = new Moto("Bros",2020,"XPX-5544",
				"Honda","Vermelha","sim","sim","sim");
		System.out.println();
		System.out.println("Modelo: "+moto.getModelo());
		moto.acelerar();
		moto.frear();
		
		

	}

}

package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lista {

	public static void main(String[] args) {
		List<String> listaNomes = new Vector<String>();
		
		listaNomes.add("Welliton");
		listaNomes.add("josé");
		listaNomes.add("Pedro");
		listaNomes.add("Gabriel");
		listaNomes.add("Ruan");
		
		listaNomes.remove("Ruan");
		
		//listaNomes.clear();
		
		System.out.println("Tomanho da lista: "+listaNomes.size());
		
		boolean verify = listaNomes.contains("Welliton");
		
		if (verify == true)
			System.out.println("O nome  está na lista");
		for (String nome : listaNomes)
			System.out.println(nome);
		
			

	}

}

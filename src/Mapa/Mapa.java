package Mapa;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<String, Integer>();
		mapa.put("Welliton", 31);
		mapa.put("Pedro", 19);
		mapa.put("Gabriel", 21);
		mapa.put("Ruan", 20);
		
		for (int m : mapa.values())
			System.out.println(m);

	}

}

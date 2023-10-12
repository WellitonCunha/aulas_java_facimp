package Conjunto;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {

	public static void main(String[] args) {
		Set<Integer> conjunto = new HashSet<Integer>();
		
		conjunto.add(1);
		conjunto.add(1);
		conjunto.add(2);
		conjunto.add(3);
		
		for (int c : conjunto)
			System.out.println(c);

	}

}

package AgrupamentoObjeto;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapa {
	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<>();
		mapa.put("Alice", 25);
		mapa.put("Bob", 30);
		mapa.put("Charlie", 22);
		
		Set<String> chave = mapa.keySet();
		Collection<Integer> valor = mapa.values();
		System.out.println(valor);
	}
}

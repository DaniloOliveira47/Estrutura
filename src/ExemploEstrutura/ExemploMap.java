package ExemploEstrutura;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "São Paulo");
		map.put(2, "Palmeiras");
		map.put(128, "Corinthians");
        
		map.forEach((key, valor) -> {
			System.out.println("Posição no Ranking: " + key);
			System.out.println("Nome: " + valor);
		});
		System.out.println();
        
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println("Key: " + entry.getKey() + " Nome: " + entry.getValue());
		}
		System.out.println();
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		}
		System.out.println();
		
		map.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		});
		System.out.println();
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
        
		table.put(300, "Corinthians");
		table.put(1, "São Paulo");
		table.put(2, "Palmeiras");
        
		Enumeration<Integer> keys = table.keys();
		while (keys.hasMoreElements()) {
			int key = keys.nextElement();
			String value = table.get(key);
			System.out.println(key + " = " + value);
		}
		System.out.println();
		
		for (Map.Entry<Integer, String> entry : table.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.println();
		
		table.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		});
		System.out.println();
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Um", 1);
		map2.put("Dois", 2);
		map2.put("Três", 3);
		
		TreeMap<String, Integer> map3 = new TreeMap<>();
		map3.put("Quatro", 4);
		map3.put("Cinco", 5);
		map3.put("Seis", 6);
		
	}
}

package ExemploEstrutura;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new String("Pedro") == new String("Pedro"));

		System.out.println(new String("Pedro").equals(new String("Pedro")));

		// GestaoEstudantes gs = new GestaoEstudantes();
		// MenuHandler menu = new MenuHandler(gs);
		// System.out.println(gs.hashCode());
		// System.out.println(menu.hashCode());

		
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add((1));
		hashSet.add((244));
		hashSet.add((56));
		hashSet.add((32));
		hashSet.add((107));
		hashSet.add((6));
		hashSet.add((8));
		hashSet.add((9)); 
		hashSet.add((10));
		
		Set treeSet = new TreeSet<Integer>(hashSet);
		System.out.println("Elementos Ordenados");
		for (int ordenado : hashSet) {
			System.out.println(ordenado);
		}
		
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add((1));
		set.add((244));
		set.add((56));
		set.add((32));
		set.add((107));
		set.add((6));
		set.add((7));
		set.add((8));
		set.add((9));
		set.add((10));

		System.out.println();
		System.out.println("Elementos Desordenados");
		for (int desordenado : set) {
			System.out.println(desordenado);
		}
		
		Iterator<Integer> iterator = hashSet.iterator();
LinkedHashSet<String> lkHash = new LinkedHashSet<String>();
Iterator<String> iteratorLkHash = lkHash.iterator();

Set<String> setMap = new TreeSet<String>();
Iterator<String> setMapIterator = setMap.iterator();

		System.out.println("Listando elementos com Iterator");
		while (iterator.hasNext()) {
			Integer item = iterator.next();
			System.out.println(item);
		}
	}
	

}

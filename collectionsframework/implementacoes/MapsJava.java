package collectionsframework.implementacoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class MapsJava {

	public static void main(String[] args) {
		/*alguns métodos:
		 * Object put(K key, V value)
		 * Object get(Object key)
		 * Object remove(Object key)
		 * boolean containsKey(Object key)
		 * boolean containsValue(Object value)
		 * int size()
		 * boolean isEmpty()
		 */
		/*bulk methods:
		 * void putAll(Map<? extends K, ? extends V> map)
		 * void clear()
		 * Set<K> keySet()
		 * Collection<V> values()
		 * Set<Map.Entry<K,V>> entrySet()
		 */
		
		
		Map<String ,Integer> map = new HashMap<>();
		map.put("alan", 1);
		map.put("murilo", 2);
		map.put("pedro", 3);
		map.put("láia", 10);
		
//		System.out.println(map.get("láia"));
//		
//		System.out.println(map.get("shs")); // pode dar erro se não estiver usando uma Wrapper class como valor.
//		//uma solução:
//		System.out.println(map.getOrDefault("sdasd", 0));
//		System.out.println(map.getOrDefault("alan", 1));
//		//outra solução:
//		System.out.println(map.containsKey("shs"));
//		System.out.println(map.containsKey("láia"));
//		
//		map.remove("alan");
//		
//		System.out.println(map.containsKey("alan"));
//		
//		Map<Integer, List<Integer>> adj = new HashMap<>();
		
		/*
		 * 1 - 3
		 * 3 - 5
		 * 1 - 2
		 * 1 - 1
		 * 2 - 4
		 * 2 - 6
		 */
		
//		if(adj.get(1) == null) 
//			adj.put(1, new ArrayList<>());
//		adj.get(1).add(3);
//		adj.get(1).add(2);
//		adj.get(1).add(1);
//		
//		if(adj.get(2) == null)
//			adj.put(2, new ArrayList<>());
//		adj.get(2).add(4);
//		adj.get(2).add(6);
//		
//		if(adj.get(3) == null)
//			adj.put(3, new ArrayList<>());
//		adj.get(3).add(5);
//		
//		System.out.println(adj);
		
		//outra forma de inserir os elementos:
//		adj.computeIfAbsent(1, f -> new ArrayList<>()).add(3);
//		adj.computeIfAbsent(1, f -> new ArrayList<>()).add(2);
//		adj.computeIfAbsent(1, f -> new ArrayList<>()).add(1);
//		adj.computeIfAbsent(2, f -> new ArrayList<>()).add(4);
//		adj.computeIfAbsent(2, f -> new ArrayList<>()).add(6);
//		adj.computeIfAbsent(3, f -> new ArrayList<>()).add(5);
//		
//		System.out.println(adj);
		
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();	
//		
//		for(Map.Entry<String, Integer> entry : entrySet) {
//			System.out.println(entry);
//		}
		
//		Set<String> keySet = map.keySet();
//		
//		for(String key : keySet) {
//			System.out.println(key);
//		}
//		
		
		NavigableMap<Integer, Integer> nvMap = new TreeMap<>((a, b) -> b - a);
	
		nvMap.put(1, 3);
		nvMap.put(2, 5);
		nvMap.put(3, 8);
	
		System.out.println(nvMap);
		
		//ou
		
		Set<Map.Entry<Integer, Integer>> setMap = nvMap.entrySet();
		for(Map.Entry<Integer, Integer> entry : setMap) {
			System.out.println("keys: " + entry.getKey() + ", valores: " + entry.getValue());
			
		}
		
		System.out.println(nvMap.pollFirstEntry());
		System.out.println(nvMap.ceilingKey(1));
		System.out.println(nvMap.ceilingEntry(1));
		
	}

}

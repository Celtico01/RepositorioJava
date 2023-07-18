package collectionsframework.implementacoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListsJava {
	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<>();
		
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		//System.out.println(arrList.get(2));
		arrList.remove(2);
		arrList.add(4);
		//System.out.println(arrList.get(2));
		
		List<Integer> linkedList = new LinkedList<>(arrList);
		
		linkedList.addAll(arrList);
		
		//for(Integer x : linkedList) {
		//	System.out.println(x);
		//}
		
		List<Integer> vector = new Vector<>(linkedList);
		
		vector.size();
		
		for(Integer x : vector) {
			System.out.println(x);
		}
		
		vector.removeAll(arrList);
		System.out.println("___________________");
		for(Integer x : vector) {
			System.out.println(x);
		}
		
		//é só alguns testes.
	}
}

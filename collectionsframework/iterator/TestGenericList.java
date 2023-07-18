package collectionsframework.iterator;

import java.util.Iterator;

@SuppressWarnings("unused")
public class TestGenericList {

	public static void main(String[] args) {
		GenericList<Integer> list = new GenericList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		//if a class has a implementation of the interface Iterator you can use a for each loop
		for(int x : list) {
			System.out.println(x);
		}
		
		//do the same thing
		
		//Iterator<Integer> iterator =  list.iterator();
		//while(iterator.hasNext()){
		//	System.out.println(iterator.next());
		//}

	}

}

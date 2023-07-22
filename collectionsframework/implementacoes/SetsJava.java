package collectionsframework.implementacoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import collectionsframework.implementacoes.comparable.StudentMarks;


@SuppressWarnings("unused")
public class SetsJava {
	
	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<>();
//		
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(2);
//		
//		System.out.println(set);
//		
//		set.remove(2);
//		
//		System.out.println(set);
//		
////		set.clear();
////		
////		System.out.println(set);
//		
//		set.add(4);
//		
//		Set<Integer> set2 = new HashSet<>();
//		
//		set2.add(7);
//		set2.add(5);
//		set2.add(1);
//		
//		System.out.println(set);
//		System.out.println(set2);
//		
//		set2.retainAll(set);
//		
//		System.out.println(set);
//		System.out.println(set2);
//		
//		set.removeAll(set2);
//		
//		System.out.println("after removing");
//		
//		System.out.println(set);
//		System.out.println(set2);
//		
//		set.add(7);
//		
//		for(int x : set) {
//			System.out.println(x);
//		}
		
		//HashSet cant be sorted and they have no order.
		
		//LinkedHashSet. LHS extends the HashSet and now with the LHS we can have some kind of order with the set
		
		
//		Set<Integer> linkset = new LinkedHashSet<>();
//		
//		linkset.add(1);
//		linkset.add(3);
//		linkset.add(8);
//		
//		System.out.println(linkset);
		//o LHS funciona igual o hashset uma das diferenças é que o LHS guarda a ordem de inserção.
		
		//agora vamos criar um set sem usar uma CLasse Wrapper.
		
//		Set<StudentMarks> setmarks = new HashSet<>();
//		
//		setmarks.add(new StudentMarks(10, 9.2, 10));
//		setmarks.add(new StudentMarks(5, 9.4, 6.4));
//		setmarks.add(new StudentMarks(7, 9.7, 8));
//		setmarks.add(new StudentMarks(2, 6.2, 0));
//		setmarks.add(new StudentMarks(7, 6.2, 6));
//		setmarks.add(new StudentMarks(8.2, 2, 9));
//		
//		Set<Integer> exemplo = new HashSet<>();
//		
//		exemplo.add(1);
//		exemplo.add(3);
//		exemplo.add(6);
//		exemplo.add(2);
//		
//		System.out.println(setmarks);
//		
////		System.out.println(exemplo.contains(1));
////		System.out.println(setmarks.contains(new StudentMarks(10,9.2,10)));
//		
//		//os 2 deveriam ser verdadeiros!
//		//apos sobrescrever os metodos hashcode e equals em StudentMarks ambos serão verdadeiros!
//		
//		System.out.println(exemplo.contains(1));
//		System.out.println(setmarks.contains(new StudentMarks(10,9.2,10)));
		
		
		//tree set
		
//		Set<StudentMarks> treeset = new TreeSet<>( (o1, o2) -> (int) o2.getMatematica() - (int) o1.getMatematica() );
//		
//		treeset.add(new StudentMarks(10, 9.2, 10));
//		treeset.add(new StudentMarks(5, 9.4, 6.4));
//		treeset.add(new StudentMarks(7, 9.7, 8));
//		treeset.add(new StudentMarks(2, 6.2, 0));
//		treeset.add(new StudentMarks(7, 6.2, 6));
//		treeset.add(new StudentMarks(8.2, 2, 9));
//		
//		for(StudentMarks x : treeset) {
//			System.out.println(x + ",");
//		}
		
		Set<Integer> treeset2 = new TreeSet<>();
		
		treeset2.add(1);
		treeset2.add(6);
		treeset2.add(3);
		treeset2.add(4);
		treeset2.add(2);
		
		//System.out.println(treeset2);
		
		//treeSet is sorted!
		
		NavigableSet<Integer> naviSet = new TreeSet<>(treeset2);
		
		System.out.println(naviSet);
		
		System.out.println(naviSet.ceiling(3));
		System.out.println(naviSet.floor(3));
		System.out.println(naviSet.higher(3));
		System.out.println(naviSet.lower(3));
		
		naviSet.remove(3);
		System.out.println("===========================");
		
		System.out.println(naviSet.ceiling(3));
		System.out.println(naviSet.floor(3));
		System.out.println(naviSet.higher(3));
		System.out.println(naviSet.lower(3));
		
	}
}

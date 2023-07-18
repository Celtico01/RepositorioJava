package collectionsframework.implementacoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeJava {

	public static void main(String[] args) {
		Deque<Integer> arrDeque = new ArrayDeque<>();
		
		arrDeque.offerFirst(1);
		arrDeque.offerFirst(2);
		
		System.out.println(arrDeque);
		
		arrDeque.pollFirst();
		arrDeque.peekFirst();
		
		System.out.println(arrDeque);
	}

}

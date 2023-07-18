package collectionsframework.implementacoes;

import java.util.Stack;

public class StackJava {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(2);
		stack.push(1);
		
		System.out.println(stack.capacity());
		System.out.println(stack.firstElement());
		System.out.println(stack.size());
		
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}

	}

}

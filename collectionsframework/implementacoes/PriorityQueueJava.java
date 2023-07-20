package collectionsframework.implementacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import collectionsframework.implementacoes.comparator.MyComparator;
import collectionsframework.implementacoes.comparable.StudentMarks;

@SuppressWarnings("unused")
public class PriorityQueueJava {

	public static void main(String[] args) {
//		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
//		
//		pqueue.offer(1);
//		pqueue.offer(2);
//		pqueue.offer(0);
//		pqueue.offer(100);
//		
//		//top 2
//		List<Integer> top2 = new ArrayList<>();
//		int indice = 0;
//		while(!pqueue.isEmpty()) {
//			if(indice == 2) break;
//			
//			top2.add(pqueue.poll());
//			indice++;
//		}
//		System.out.println(top2);
//		System.out.println(pqueue);
		
		//agora é necessario o bottom 2, pra isso será necessario o uso do comparator
		
//		PriorityQueue<Integer> pqueue2 = new PriorityQueue<>(new MyComparator());
//		
//		pqueue2.offer(1);
//		pqueue2.offer(2);
//		pqueue2.offer(0);
//		pqueue2.offer(100);
//		
//		
//		//bottom 2
//		List<Integer> bottom2 = new ArrayList<>();
//		int indice2 = 0;
//		while(!pqueue2.isEmpty()) {
//			if(indice2 == 2) break;
//			
//			bottom2.add(pqueue2.poll());
//			indice2++;
//		}
//		System.out.println();
//		System.out.println(bottom2);
//		System.out.println(pqueue2);
		
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		
//		List<StudentMarks> smarks = new ArrayList<>();
//		smarks.add(new StudentMarks(10, 9.2, 10));
//		smarks.add(new StudentMarks(5, 9.4, 6.4));
//		smarks.add(new StudentMarks(7, 9.7, 8));
//		smarks.add(new StudentMarks(2, 6.2, 0));
//		smarks.add(new StudentMarks(7, 6.2, 6));
//		smarks.add(new StudentMarks(8.2, 2, 9));
//		
//		/* caso seja executado antes da implementação do comparable e comparator na classe 
//		 * "StudentMarks" vai dar erro pois a PriorityQueue necessita do Comparable!*/
//		
//		PriorityQueue<StudentMarks> qmarks = new PriorityQueue<>(smarks);
//		List<StudentMarks> top3 = new ArrayList<>();
//		int indice = 0;
//		while(!qmarks.isEmpty()) {
//			
//			if(indice == 3) break;
//			
//			top3.add(qmarks.poll());
//			indice++;
//		}
//		System.out.println(top3);
		
		
		PriorityQueue<Integer> pqueue2 = new PriorityQueue<>( (a, b) -> b - a ); //lambda function 
		
		pqueue2.offer(1);
		pqueue2.offer(2);
		pqueue2.offer(0);
		pqueue2.offer(100);
		
		
		//bottom 2
		List<Integer> bottom2 = new ArrayList<>();
		int indice2 = 0;
		while(!pqueue2.isEmpty()) {
			if(indice2 == 2) break;
			
			bottom2.add(pqueue2.poll());
			indice2++;
		}
		System.out.println();
		System.out.println(bottom2);
		System.out.println(pqueue2);
		
		
	}

}

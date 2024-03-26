package collections;

import java.util.*;

public class LPractice {

	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<>();
		ll.add("p1");
		ll.add("p2");
		ll.add("p3");
	
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("prasad");
		ll1.add("Jyo");
		ll1.add("Manu");
//		
		ll.addAll(ll1);
//		
//		ll.removeAll(ll1);	
		
//		System.out.println(ll.get(4));
//		System.out.println(ll.contains("Jyo"));
//		System.out.println(ll.containsAll(ll1));
//		System.out.println(ll.size());
		for(String list:ll) {
			System.out.print(list + " ");
		}
	}

	

}

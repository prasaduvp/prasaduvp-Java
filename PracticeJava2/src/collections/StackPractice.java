package collections;

import java.util.*;

public class StackPractice {

	public static void main(String[] args) {
		
		Stack <String>books = new Stack<>();
		books.push("red colour");
		books.push("white colour");
		books.push("brown colour");
		books.push("black colour");
		
		System.out.println(books);
		
//		System.out.println(books.peek());		
//		System.out.println(books.pop());
//		System.out.println(books.search("white colour"));
		System.out.println(books.empty());
//		System.out.println(books);
		

	}

}

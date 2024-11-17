package lesson7thirdex;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayBasedStack<String> stack1 = new ArrayBasedStack<String>();
		
		stack1.push("JAVA");
		stack1.push("OOP");
		stack1.push("091024");
				
		Iterator<String> itr1 = stack1.iterator();
		for(;itr1.hasNext();) {
		   String el = itr1.next();
		   System.out.println(el);
		}
		
		
		System.out.println();
		
		ArrayBasedStack<Integer> stack2 = new ArrayBasedStack<Integer>();
		
		
		stack2.push(2);
		stack2.push(-3);
		stack2.push(4);
		
		Iterator<Integer> itr2 = stack2.iterator();
		for(;itr2.hasNext();) {
		   Integer el = itr2.next();
		   System.out.println(el);
		}
		

	}

}

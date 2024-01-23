package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> a= new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println("Initial values:"+a);
		for(Integer i:a){
			{
				System.out.println(i);
			}
		}
		a.remove(3);
		System.out.println("after removal action"+a);
		int s=a.size();
		System.out.println("size of the array is "+a.size());
		a.addAll(a);// adds same elements with the existing elements 
		System.out.println(a);
		a.addFirst(4);
		a.addLast(13);
		a.remove(2);
		a.getFirst();
		a.getLast();
		a.get(3);
		System.out.println(a);

	}

}

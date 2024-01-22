package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a= new ArrayList<String>();
		a.add("Hi");
		a.add("hello");
		a.add("java");
		a.add("123");
		System.out.println(a);
		for(String i:a){
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
		//boolean x=a.contains("123");
		//System.out.println(x);
		//a.removeAll(a);
		//System.out.println("array after remove all="+a);
		Iterator it=a.iterator();
		while(it.hasNext());
		{
			System.out.println(it.next());
		}
	}

}

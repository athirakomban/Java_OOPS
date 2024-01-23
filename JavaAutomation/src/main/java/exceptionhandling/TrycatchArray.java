package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrycatchArray {
	int i;
	public void arraytrycatch()
	{
		int a[]= {1,2,4,5,6};
		try
		{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter an element");
		a[0]=scan.nextInt();
		System.out.println("lenth of the array="+a.length);
		System.out.println(a[6]);
		
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println(b);
			System.out.println("Array Index Out Of Bounds Exception");
			for(i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			
		}
		catch(InputMismatchException c)
		{
			System.out.println(c);
			System.out.println("Input Mismatch Exception: entered non integer value in the array");
			for(i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrycatchArray tc=new TrycatchArray();
		tc.arraytrycatch();
		
		
		

	}

}

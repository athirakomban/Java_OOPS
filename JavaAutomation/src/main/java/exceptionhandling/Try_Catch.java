package exceptionhandling;

public class Try_Catch {
	
	public void unchecked()
	{
		try
		{
		int a=10/0;
		System.out.println(a);
		}
		/*catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("unchecked exception");
		}*/
		/*catch(Exception e)
		{
			System.out.println(e);
			System.out.println("unchecked exception");
		}*/
		finally
		{
			System.out.println("Finally exception");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Try_Catch tc= new Try_Catch();
		tc.unchecked();

	}

}

package exceptionhandling;

public class Eligibility {
	public void eligibility()
	{
		//int age=50;
		int age=15;
		if(age>18)
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println("Not eligible");
			//throw new ArithmeticException("Not eligible higher than 18");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eligibility e= new Eligibility();
		e.eligibility();

	}

}

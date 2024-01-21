package practiceprograms;

public class AdditionChild extends AdditionParent{
	public void division()
	{
		super.add();
		System.out.println("Result of addition="+c);
		System.out.println(super.a);
		System.out.println(super.b);
		int d=c%10;
	
		if(d==0)
		{
			System.out.println("The addition result is devisible by 10");
		}
		else
		{
			System.out.println("The addition result is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionChild result= new AdditionChild();
		result.division();
		

	}

}

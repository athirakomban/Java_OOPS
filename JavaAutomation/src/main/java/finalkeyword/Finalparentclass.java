package finalkeyword;

public class Finalparentclass {
	final int a=10;
	public Finalparentclass()
	{
		//a=20;
		System.out.println("constructor of parent class");
		System.out.println(a);
	}//can not override final method in parent class. Can not change value of final variables
	/*public void print()
	{
		System.out.println("Final method from parent class");
	}*/
	public static void main(String args[])
	{
		Finalparentclass fp=new Finalparentclass();
		//fp.print();
	}
}

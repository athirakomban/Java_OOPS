package Accessmodifier2;

public class Aclass4 {
	public void method1()
	{
		System.out.println("public accessmodifier");
	}
	private void method2()
	{
		System.out.println("private accessmodifier");
	}
	protected void method3()
	{
		System.out.println("protected accessmodifier");
	}
	void method4()
	{
	System.out.println("default accessmodifier");
	}
	public static void main(String args[])
	{
		Aclass4 a= new Aclass4();
		a.method1();
		a.method2();
		a.method3();
		a.method4();
	}

}

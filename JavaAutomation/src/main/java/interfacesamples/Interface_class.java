package interfacesamples;

public class Interface_class implements Interface1,Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_class inter = new Interface_class();
		inter.add();
		inter.print();
		inter.print2();
		inter.display();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println(b);
		int c=a+b;
		System.out.println(c);
		System.out.println("Abstract method1 ");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("Abstract method2");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
	System.out.println("Multilevel Inheritance method1 from 2nd interface");	
	}

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		System.out.println("Multilevel Inheritance method2 from 2nd interface");
	}

}

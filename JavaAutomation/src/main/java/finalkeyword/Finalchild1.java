package finalkeyword;

public class Finalchild1 extends Finalparentclass{
	public final void print()
	{
		//super.print();
		System.out.println("Final method from child class");
	}
	public void display() 
	{
		System.out.println("method from child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Finalchild1 fc= new Finalchild1();
		fc.print();
		//fc.print2();
		fc.display();
		

	}

}

package Inheritance;

public class SingleInheritanceChild extends SingleInheritanceParent{
	public void print()
	{
		System.out.println("Single Inheritance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritanceChild s= new SingleInheritanceChild();
		s.print();
		s.display();

	}

}

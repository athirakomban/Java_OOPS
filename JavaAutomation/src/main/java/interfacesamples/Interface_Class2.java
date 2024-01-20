package interfacesamples;

public class Interface_Class2 implements Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_Class2 inter2= new Interface_Class2();

		inter2.add();
		inter2.display();
		inter2.print2();
		inter2.print();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Heirarcical");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Multilevel");
	}

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		System.out.println("Multiple");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hybrid");
			
		}
		
	}



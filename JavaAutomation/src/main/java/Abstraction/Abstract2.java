package Abstraction;

public class Abstract2 extends Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract2 ab= new Abstract2();
		ab.sum();
		ab.print();

	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int a=5;
		int b= 7;
		int c= a+b;
		System.out.println(c);
	}

}

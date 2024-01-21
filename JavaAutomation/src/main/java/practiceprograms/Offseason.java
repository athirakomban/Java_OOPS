package practiceprograms;

public class Offseason {
	float total=100;
	float discount;
	float payment;
	float p;
	float discount2;
	public void discount()
	{
		discount=(total*15)/100;
		payment=total-discount;
		System.out.println("Offseason discount 15%="+discount);
		System.out.println("Total off season payment="+payment);
	}

}

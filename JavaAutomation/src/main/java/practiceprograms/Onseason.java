package practiceprograms;

public class Onseason extends Offseason {

	public void discount()
	{
		discount2=(total*40)/100;
		p=total-discount2;
		System.out.println("Onseason discount 40%="+discount2);
		System.out.println("The total payment onseason="+p);
		super.discount();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onseason d= new Onseason();
		d.discount();
		
		
		

	}

}

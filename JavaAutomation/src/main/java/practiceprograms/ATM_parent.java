package practiceprograms;

public class ATM_parent {
	private int pin1;
	private int pin2;
	private int pin3;
	
	public void setpin(int pin1,int pin2,int pin3)
	{
		this.pin1=pin1;
		this.pin2=pin2;
		this.pin3=pin3;
	}
	public void getpin()
	{
		System.out.println("Pin1="+pin1);
		System.out.println("Pin2="+pin2);
		System.out.println("Pin3="+pin3);
		
	}

}

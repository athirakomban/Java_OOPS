package practiceprograms;

public class Address {
	Student a;
	String address;
	public Address(String address,Student a)
	{
		this.address=address;
		this.a=a;
	}
	public void studentdetails()
	{
		System.out.println("Name:"+a.Name+",Rollnumber:"+a.Rollnumber+",Address:"+address);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student("John",17);
		Address d= new Address("Ernakulam",s);
		d.studentdetails();
		
		
		

	}

}

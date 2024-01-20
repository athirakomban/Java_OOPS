package aggregation;

public class AggregationChild {
	Aggregation_parent a;
	String name;
	int id;
	public AggregationChild(String name, int id,Aggregation_parent a)
	{
		this.name=name;
		this.a=a;
		this.id=id;
		
	}
	public void print()
	{
		System.out.println("Name:"+name+",Employee ID:"+id);
		System.out.println("Name:"+a.name+",Employee ID:"+a.id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation_parent ap= new Aggregation_parent("John",123);
		AggregationChild ac= new AggregationChild("Mike",3563,ap);
		ac.print();

	}

}

public class  Parent
{

	public class Sample {
		public  void display()
		{
			System.out.println("Inner Sample - display");
		}
	}
		public  void display()
		{
			System.out.println("Sample - display");
		}
	/*public static void main(String[] args) 
	{
		//Parent.Sample obj = new Parent.Sample();//Accessing while non static
		//Parent.Sample.display(); //Accessing staticaly
	}*/
}
class Child 
{
	public static void main(String a[])
	{
		Parent p = new Parent();
		Parent.Sa,;l;;mple obj = p.new Sample();
		p.display();
		obj.display();
	}
}

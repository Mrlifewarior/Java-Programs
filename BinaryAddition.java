import java.lang.Math;
class BinaryAddition 
{
	public static void main(String[] aa) 
	{
		int a = Integer.parseInt(aa[0],2);
		int b = Integer.parseInt(aa[1],2);
		int c = a+b;
		System.out.println("Addition of "+aa[0]+" and "+aa[1]+" is "+Integer.toBinaryString(c));
		System.out.println("Answer in decimal is "+c);
	}
}

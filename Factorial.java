class  Factorial
{
	public static void main(String[] args) 
	{
		System.out.println("Total No. of Arguments "+args.length);
		int  fact=1;
		for(int i=Integer.parseInt(args[0]) ; i>0 ; i--)
			fact*=i;
		System.out.println("Factorual of  "+args[0]+" is "+fact);

	}
}

class X
{
	static int fact(int x)
	{
		int i,f=1;
		for(i=1;i<=x;i++)
		{
			f=f*i;
		}
		return f;
	}
}
class Factorial
{
	public static void main(String args[])
	{
		System.out.println("Factorial of the given number is: "+X.fact(Integer.parseInt(args[0])));
	}
}
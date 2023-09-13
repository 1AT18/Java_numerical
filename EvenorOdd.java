public class EvenorOdd 
{
	public static void check(int n)
	{
		if(n%2==0)
		{
			System.out.println(n+ " is even number");
		}
		else
		{
			System.out.println(n+ " is odd number");
		}
	}
	public static void main(String[] args) 
	{
		check(4);
		check(7);
        check(9);
	}
}

//20. find out the factorial value of a given number.
class Q20 
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("enter 1 cla");
			return;
		}
		int num1 = Integer.parse.Int(args[0]);
		int i = num1 ,factorialValue = 1;
		while(i != 0)
		{
			factorialValue = factorialValue * i;
			i--;
		}
		System.out.println(" factorial value of " + num1 + " is: " + factorialValue);
	}
}

//21.Develop a program to find out given number is a
 //            prime r not?
class Q21 
{
	public static void main(String[] args) 
	{
		{
		if (args.length < 1)
		{
			System.out.println("enter 1 cla");
			return;
		}
		int num1 = Integer.parse.Int(args[0]);
		boolean isPrime = true;
		for(int i = 2; i <= (num1 / 2); i++)
			{
			  if (num1 % i == 0)
			  {
				  isPrime = false;
				  break;
			  }
            }
			if (isPrime)
			{
               System.out.println(num + "is a prime number");
			}
			else
			{
				System.out.println(num + "is not a prime number");
			}
	}
}

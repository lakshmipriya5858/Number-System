//27.Develop a program to print sum of prime numbers
//  between two given numbers
class  Q27
{
	public static void main(String[] args) 
	{
		if (args.length < 2)
		{
		  System.out.println("plz supply two cla");
		  return;
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		boolean isPrime = true;
		int sum = 0;
	  for (int i=num1; i<=num2; i++)
	  {
		  for (int j=2;j<=(i / 2); j++)
		  {
			  if (i % j == 0)
			  {
				  isPrime = false;
				  break;
			  }
		  }
		  if (isPrime)
		  {
	        	sum +=i;
		  }
		  isPrime = true;
		  i++;
	  }
	  System.out.println("sum of all prime numbers from" + num1 "and" + num2 "is:" + sum);
	}
}

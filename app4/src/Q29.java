//29.Develop a pogram to print prime numbers which are immediately 
//           after multiples of 10 and below 200.
class  Q29
{
	public static void main(String[] args) 
	{
		boolean isPrime = true;
		for (int i=10; i<=200; i++)
		{
			for (int j=2; j<=(1 / 2); j++)
			{
				if (i % j ==0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
			{
				if (i % 10 == 0)
				{
				System.out.print(i + ",");
				}
			}
			isPrime = true;
			i++;
		}
	}
}

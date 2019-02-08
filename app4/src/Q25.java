//25.Develop a program to print 20 prime numbers from 100
class  Q25
{
	public static void main(String[] args) 
	{
         int i=100;
		 int count =0;
		 boolean isPrime = true;
		 while(count < 20) 
		{
			for (int j=1; j<=(i / 2); j++)
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
			{
				System.out.println(i + ",");
				count++;
			}
             isPrime = true;
			 i++;
		}
	}
}

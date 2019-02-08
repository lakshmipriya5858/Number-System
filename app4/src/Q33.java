//33.Develop a program to print numbers which should come
//after 3 non prime numbers.Develop between 10 to 100.
class  
{
	public static void main(String[] args) 
	{
		boolean isPrime = true;
		int nonPrimecount = 0;
       for (int i=10; i<=100; i++)
       {
		   for (int j=2; j<=(i / 2); j++)
		   {
			   if (i % j == 0)
			   {
				   nonPrimecount++;
				   isPrime=false;
				   break;
			   }
		   }
		   if (nonPrimecount == 3)
		   {
			   System.out.print((i+1) + ",");
			   nonPrimecount=0;
		   }
		   if (isPrime)
		   {
			   nonPrimecount = 0;
		   }
		   isPrime=true;
       }
	}
}

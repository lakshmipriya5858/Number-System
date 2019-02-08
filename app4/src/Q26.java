//26.Develop a program to print sum of initial 30 prime numbers.
class  Q26
{
	public static void main(String[] args) 
	{
		int i = 3;
		 int count= 2;
		 int sum = 1 + 2;
		 boolean isPrime = true;
		 while (count < 30)
		 {
			 for (int j = 2; j<=(i / 2); j++)
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
				 count++;
			 }
			 isPrime = true;
			 i++;
		 }
		  System.out.println("sum of initial 30 prime numbers:" + sum);
	}
}

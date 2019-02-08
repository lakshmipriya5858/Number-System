//Develop a program to print initial 20 prime numbers?
class Q22 
{
	public static void main(String[] args) 
	{
		System.out.print(1 + "," + 2 + ",");
		int count = 2;
		boolean isPrime = true;
		int i = 3;
		while (count < 20)
		{
			for (int j = 2; j <=(i / 2); j++)
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
			{
				System.out.print(i + ",");
				count ++;
			}
			isPrime = true;
			i++;
		}
	}
}

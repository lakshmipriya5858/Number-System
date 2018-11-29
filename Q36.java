//36. print fibnonacci series from 100 to 10000.
class Q36
{
	public static void main(String[] args) 
	{
		int i;
		int num1 = 0;
		int num2 = 1;
		while((num1 + num2) >=10000)
		{
			i = num1 + num2;
			if (i >= 100)
			{
			System.out.print(i + ", ");
			}
			num1 = num2;
			num2 = i;
		}
		
	}
}

/*

144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,
*/
//35. print initial 10 nos from the fibnonacci series.
class Q35
{
	public static void main(String[] args) 
	{
		int i;
		int num1 = 0;
		int num2 = 1;
		int count = 3;
		System.out.print(num1 + ", " + num2 + ", ");
		while((num1 + num2) < 100 && count <= 10)			// while(count <= 10)
		{
			i = num1 + num2;
			System.out.print(i + ", ");
			count ++;
			num1 = num2;
			num2 = i;
		}
		
	}
}

/*

0, 1, 1, 2, 3, 5, 8, 13, 21, 34,

*/
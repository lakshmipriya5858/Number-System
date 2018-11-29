//34. Print Fibonacci series till to 100. 
class Q34 
{
	public static void main(String[] args) 
	{
		int i;
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + ", " + num2 + ", ");
		while((num1 + num2) < 100)
		{
			i = num1 + num2;
			System.out.print(i + ", ");
			num1 = num2;
			num2 = i;
		}
		
	}
}

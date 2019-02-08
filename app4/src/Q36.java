//36.print fabinacci series from 100 to 10000.
class  Q36
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 1;
		int newnum;
		while((num1 + num2) < 10000)
		{
			newnum = num1 + num2;
			if(newnum > 100)
			{
			System.out.print(newnum+ ",");
			}
			num1 = num2;
			num2 = newnum;
		}
	}
}

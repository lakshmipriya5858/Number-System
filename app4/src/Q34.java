//34.print fibonacce series till to 100
class  Q34
{
	public static void main(String[] args) 
	{
	 int num1=0;
	 int num2=1;
	 int newNum;
	 System.out.print(num1+ "," + num2+ ",");
     while ((num1 + num2)<100)
      {
		 newNum=num1 + num2;
		 System.out.print(newNum + ",");
		 num1 = num2;
		 num2 = newNum;
      }
	}
}

//31.Developa program to print 30 prime number which are 
//having digits in raising order after 10.
//(example: 13,17,19,23,29,37,39....
class  Q31
{
	public static void main(String[] args) 
	{
		boolean isPrime= true;
		 int i=10;
		 int count = 0;
		 while(count < 30)
		{
             for (int j=2; j<=(i / 2); j++)
             {
				 if (i % j == 0)
				 {
					 isPrime = false;
					 break;
				 }
             }
			 if (isPrime && isRaisingOrder(i))
			  {
			   System.out.print(i +",");
			   count++;
			 }
			 isPrime =  true;
			 i++;
		}
	}
		static boolean isRaisingOrder(int i)
		{
			boolean isRaisingOrder = true;
			int j =i,currentdigit,prevdigit=i % 10;
			j = j / 10;
			while (j != 0)
			{
			currentdigit = j % 10;
			if (currentdigit >= prevdigit)
			{
				isRaisingOrder = false;
				break;
			}
			prevdigit = currentdigit;
			j = j / 10;
			}
	   return isRaisingOrder;
	}
}

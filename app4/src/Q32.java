//32.Develop a program to print 30 prime numbers
//which are having digits in decending order after 10.
class Q32 
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
			 if (isPrime && isnotRaisingOrder(i))
			  {
			   System.out.print(i +",");
			   count++;
			 }
			 isPrime =  true;
			 i++;
		}
	}
		static boolean isnotRaisingOrder(int i)
		{
			boolean isnotRaisingOrder = true;
			int j =i,currentdigit,prevdigit=i % 10;
			j = j / 10;
			while (j != 0)
			{
			currentdigit = j % 10;
			if (currentdigit <= prevdigit)
			{
				isnotRaisingOrder = false;
				break;
			}
			prevdigit = currentdigit;
			j = j / 10;
			}
	   return isnotRaisingOrder;
	}
}
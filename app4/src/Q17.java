//17.find out given number is palindrome or not?
class Q17
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
		   System.out.println("enter 1 cla");
		   return;
		}
		int num = Integer.parseInt(args[0]); //121
	 	int i = num, reverseNum = 0, digit;
        while(i != 0)
		{ 
	         digit = i % 10;
             reverseNum = (reverseNum * 10) + digit;
             i = i / 10;
         }
		 if (num == reverseNum)
		 {
			 System.out.println(num + "is palindrome");
		 }
		 else
		{
			 System.out.println(num + "is not a palindorm");
		}
	}
}

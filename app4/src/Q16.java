//16.Reverse a given number.
class Q16 
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
		   System.out.println("enter 1 cla");
		   return;
		}
		int num = Integer.parseInt(args[0]); //4598
	 	int i = num, reverseNum = 0, digit;
        while(i != 0)
		{ 
	         digit = i % 10;
             reverseNum = (reverseNum * 10) + digit;
             i = i / 10;
         }
		 System.out.println("reverse of" + num + ":" + reverseNum);
	}
}

//assume given number containing 3 digits.
//   now check it out first two digits sum is 3rd digit or not?
//ex : 123
//ex : 347
// ex : 268
class Q19 
{
	public static void main(String[] args) 
	{
		if (args.length < 1 || args[0].length !=3)
		{
			System.out.println("enter 1 cla with 3 digits number");
			return;
		}
		int num1 = Integer.parseInt(args[0]); //123
		int i = num1;
		int digit3 = i % 10;
		i = i / 10;
		int digit2 = i % 10;
		i = i /10;
		int digit1 = i % 10;
           if (digit3 == (digit1 + digit2))
           {
			   System.out.println(num1 +"containing");
			   System.out.println("first two digits sum as third digit");
           }
		   else
		   {
                System.out.println(num1 +" not containing");
			   System.out.println("first two digits sum as third digit");
		   }
	}
}

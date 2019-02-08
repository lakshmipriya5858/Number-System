// 12. find out whether digits are in raising order or not in a given number?
/*
       example1:  12345 (yes)
       example2:  12745 (no)
       example3:  368 (yes)
       example4:  361 (no)
       example5:  2579 (yes)
       example6:  2574 (no)
*/

class Q2  
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
		System.out.println("plz supply 1 cla");
		return;
		}
		int num = Integer.prseInt(args[0]);
		boolean isRaisingOrder = true;
		//num = 12345
		int i = num, currentDigit, prevDigit = num % 10;
		i = i / 10;
		while (i != 0)
		{
			cuurentDigit = i % 10;
			if (prevDigit < currentDigit)
			{
				isRaisingOrder=false;
				break;
			}
			prevDigit = currentDigit;
			i = i / 10;
		}
           System.out.println("is digits of" + num + "are in RaisingOrder:" + isRaisingOrder);
	}
}

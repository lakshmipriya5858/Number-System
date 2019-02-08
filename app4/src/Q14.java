//14.find out sum of all digits of a given number.
class  Q14
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
		System.out.println("plz supply 1 cla");
		return;
		}
		int num1 = Integer.parseInt(args[0]);
		int i = num1, sum = 0, digit;
		while (i != 0)
		{
			digit = i % 10;
			sum += digit;
			i = i / 10;
		}
		System.out.println("sum of all digits in" + num1 + ":" + sum);
	}
}

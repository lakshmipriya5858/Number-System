class B20 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
		System.out.println("plz supply one command line int arg");
		return;
		}
		int num = 0;
		try
		{
			num = Integer.parseInt(args[0]);
		}
		catch (NumberformatException ex)
		{
			System.out,println("plz supply only int arg");
			return;
		}
		int num = Integer.parseInt(args[0]);
		int sum = 0,digit;
		for (;num != 0 ;num =num / 10)
		{
			digit = num % 10;
			sum = sum + digit;
		}
		System.out.println(sum);
	}
}

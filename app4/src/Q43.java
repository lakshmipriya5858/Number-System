// 43.find out  given number is a perfect number or not ?
//perfect number=number is sum of its divisible  (ex.  28 ----divisible  by 1,2,4,7,14==> 1+2+4+7+14=28) 
// 6==1,2,3

class Q43
{
	public static void main(String[] args) 
	{
		if(args.length<1)
		{
			System.out.println("pls supply 1 command line agrs");
			return;
		}
		int num1 = Integer.parseInt(args[0]);
		int sum=0;
		for(int i=1;i<=(num1/2);i++)
		{
			if(num1%i==0)
			{
				sum+=i ;
			}
		}
		if(num1==sum)
		{
			System.out.println(num1+ "is a perfect number");
		}
		else 
		{
			System.out.println(num1+ "is not  a perfect number");
		}


		
	}
}

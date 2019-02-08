//5.print true,if sum of any 2 numbers is a 3rd given number. 
class Q5
{
	public static void main(String[] args) 
	{
		if (args.length < 2)
		{
			System.out.println("plz supply 3 cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		boolean flag = (i + j == k || j + k ==i || k + i ==j) ? true : false;
		System.out.println(flag);
	}
}

//13.swap 2 int variables without 3rd variable.
class  Q13
{
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
		System.out.println("plz supply 2 cla");
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num + "," + num2);
		/*
		//with third variable
		 int temp = num1;
		 num1 num2;
		 num2 = temp;
		 */
		 //without third variable
		 //num1 =3 , num2 = 4
		 num1 = num1 + num2; //7
		 num2 = num1 - num2; //3
		 num2 = num1 - num2; //4
		 System.out.println(num1 + "," + num2);
	}
}

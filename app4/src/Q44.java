// 44.find out given 2 numbers are anagrams or not 
// anagrams for 123 are 321,312,213,
class Q44
{
	public static void main(String[] args) 
	{
		if(args.length<2)
		{
			System.out.println("pls supply 2 command line agrs");
			return;
		}
		String s1 = args[0];
		String s2 = args[1];
		boolean flag =(s1.length() ==s2.length()) && bothAreAnagrams(s1,s2);
		if(flag)
		{
			System.out.println(s1 + "and " + s2 + "are anagrams");
		}
		else
		{
			System.out.println(s1 + "and " + s2 + "are  not anagrams");
		}
		public static boolean bothAreAnagrams(String s1,String s2)
	{
			 //s1=123
			 //s2=321
			 boolean flag=false;
			 int index;
			 char c1;
			 int i =0;
			 for( ; i <  s1.length( ); i++)
		{
				 c1=s1.charAt(i);
				 index=s2.indexOf(c1);
				 if(index==-1)
			{
					 break;
			}
			s2=s2.substring(0,index) +
				s2.substring(index +1, s2.length());
		}
		flag =(  i ==s1.length( ) && s2.length==0);
		return flag;
	}
	}



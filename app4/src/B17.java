class B17 
{
	public static void main(String[] args) 
	{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}
}
 //output
 D:\java\logical coding\app4\src>java -cp ../classes B17
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at B17.main(B17.java:5)

D:\java\logical coding\app4\src>java -cp ../classes B17 hello
hello
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
        at B17.main(B17.java:6)

D:\java\logical coding\app4\src>java -cp ../classes B17 hello 123
hello
123
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
        at B17.main(B17.java:7)

D:\java\logical coding\app4\src>java -cp ../classes B17 hello 123 12
hello
123
12

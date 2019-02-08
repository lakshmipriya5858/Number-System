//18. Assume total number of digits in a given number is even. 
// Reverse only first half of the given number
class Q18
{
public static void main(String[] args) 
{
if(args.length < 1)
{
System.out.println("pls enter 1 command line args");
return;
}
int num = Integer.parseInt(args[0]); // 1234
int i = num, j = num;
//finding out total number of digits
int digitsCount = 0;
while(i != 0)
{
digitsCount ++;
i = i / 10;
}
System.out.println("digitsCount:" + digitsCount);
//reversing a number
int reverseNum = 0, currentDigit;
while(j != 0)
{
currentDigit = j % 10;
reverseNum = (reverseNum * 10) + currentDigit;
j = j / 10;
}
System.out.println("reverseNum:" + reverseNum);

//reversing first half number
//---------------------------
int factor = 1;
for(int z = 1; z <= (digitsCount / 2); z++)
{
factor = factor * 10;
}
int firstHalf = num / factor;
int secondHalf = num % factor;
System.out.println("firstHalf :" + firstHalf);
System.out.println("secondHalf:" + secondHalf);
//reversing first half
int m = firstHalf;
int revFirstHalf = 0;
while(m != 0)
{
currentDigit = m % 10;
revFirstHalf = (revFirstHalf * 10) + currentDigit;
m = m / 10;
}
System.out.println("revFirstHalf:" + revFirstHalf);
//reversing second half
m = secondHalf;
int revSecondHalf = 0;
while(m != 0)
{
currentDigit = m % 10;
revSecondHalf = (revSecondHalf * 10) + currentDigit;
m = m / 10;
}
System.out.println("revSecondHalf:" + revSecondHalf);
//reversing only first half
// add second reversed one to the first in the reverse order
int finalNumWithRevOnlyFirstHalf= revFirstHalf;
m = revSecondHalf;
while(m != 0)
{
currentDigit = m % 10;
finalNumWithRevOnlyFirstHalf = 
(finalNumWithRevOnlyFirstHalf * 10) + currentDigit;
m = m / 10;
}
System.out.println("finalNumWithRevOnlyFirstHalf:" + 
finalNumWithRevOnlyFirstHalf);

//reversing only second half
// add second half to the first half in the reverse order
int finalNumWithRevOnlySecondHalf = firstHalf;
m = secondHalf;
while(m != 0)
{
currentDigit = m % 10;
finalNumWithRevOnlySecondHalf = 
(finalNumWithRevOnlySecondHalf * 10) + currentDigit;
m = m / 10;
}
System.out.println("finalNumWithRevOnlySecondHalf:" + finalNumWithRevOnlySecondHalf);

}
}


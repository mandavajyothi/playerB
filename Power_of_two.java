import java.util.*;
import java.io.*;
class Power_of_two
{
static boolean isPowerOfTwo(int n)
{
if(n==0)
return false;
while(n!=1)
{
if(n%2!=0)
return false;
n=n/2;
}
return true;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
if (isPowerOfTwo(number))
System.out.println("yes");
else
System.out.println("no");
}
}

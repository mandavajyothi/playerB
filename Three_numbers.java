import java.io.*;
import java.util.*;
class three_numbers
{
	public static void main(String args[])
	{
		int a,b,c,res;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		res=((a^b)%c);
		System.out.println(res);
		
             }
}

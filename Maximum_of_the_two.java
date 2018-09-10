import java.util.*;
import java.lang.*;
import java.io.*;
class Maximum_of_the_2
{
public static void main(String args[]) throws java.lang.Exception
{
int n,count=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
	if(a[i]>a[i+1])
	{
		System.out.print(a[i]+" ");
		
	}
	else
	System.out.print(a[i+1]+" ");
	
}
}
}

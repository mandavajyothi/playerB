import java.util.*;
import java.io.*;
class Sum_of_maximum_elements
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0;
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int min=a[0];
int max=a[0];
for(int j=0;j<a.length;j++)
{
if(a[j]>max)
max=a[j];
if(a[j]<min)
min=a[j];
}
for(int i=0;i<n;i++)
{
	if(min!=a[i])
	{
             sum=sum+a[i];
           
	}
	
}
  System.out.println(sum);
}
}

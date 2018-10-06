import java.util.*;
import java.io.*;
class Difference_betweenLowesthighest
{
public static void main(String args[])
{
	int res;
Scanner sc=new Scanner(System.in);
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
res=max-min;
System.out.println(res);
}
}

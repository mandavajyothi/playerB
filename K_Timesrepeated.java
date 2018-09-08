import java.util.*;
class K_times_repeated
{
public static void main(String args[])
{
int n,k,count=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(k==a[i])
count++;
}
System.out.println(count);
}
}

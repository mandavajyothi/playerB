import java.util.*;
import java.io.*;
class K_exist_in_the_array
{
public static void main(String args[])
{
int n,k;
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
if(a[i]==k)
{
System.out.println("yes");
}
}
  else
  System.out.println("no");

}
}

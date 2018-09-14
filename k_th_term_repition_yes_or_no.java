 import java.util.*;
class k_th_term_repition_yes_or_no
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

System.out.println("yes "+count);

	
}

}

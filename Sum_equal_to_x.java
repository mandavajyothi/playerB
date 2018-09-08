import java.util.*;
class Sum_equal_to_X
{
	public static void main(String args[])
	{
		int n,x,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		x=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		sum=sum+a[i];
		
		}
		if(x==sum)
		{
			System.out.println("yes");
		}
		else
		System.out.println("no");
		
   }
}

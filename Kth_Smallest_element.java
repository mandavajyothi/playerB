import java.util.*;
class Kth_smallest_element
{
	public static void main(String args[])
	{
		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int j=0;j<n;j++)
		{
			if(j==k-1)
				{  
					System.out.println(a[j]);
				}
			}
   }
}

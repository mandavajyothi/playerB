import java.util.*;
class Reverse_of_a_number
{
public static void main(String args[])
{
int n,reverse=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{
reverse=reverse*10;
reverse=reverse+n%10;
n=n/10;
}
System.out.println(reverse);
}
}

import java.util.*;
import java.io.*;
class Reverse_of_the_string
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String reverse="";
for(int i=str.length()-1;i>=0;i--)
{
reverse=reverse+str.charAt(i);
}
System.out.println(reverse);
}
}

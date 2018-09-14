import java.io.*; 
import java.util.*;
 
class Binary_Representation
{
   
    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0)
        {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
 
    
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        System.out.println(countSetBits(i));
    }
}
 

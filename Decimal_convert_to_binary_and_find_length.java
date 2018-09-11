import java.util.Scanner;
class Decimal_convert_to_binary_and_find_length
{
    public static void main(String[] args) 
    {
        int n, count = 0, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            if((a==1)||(a==0))
            {
                count++;
            }
            x = x + "" + a;
            n = n / 2;
        }
       
        System.out.println(count);
    }
}

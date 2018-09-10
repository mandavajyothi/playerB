import java.util.*;
 class Exponent_values_of_a_and_b
 {
 public static void main(String[] args) 
    {

        int base , exponent;
        Scanner sc=new Scanner(System.in);
        base=sc.nextInt();
        exponent=sc.nextInt();
        
        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println(result);
    }
}

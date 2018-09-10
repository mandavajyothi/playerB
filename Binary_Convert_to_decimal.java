import java.io.*; 
import java.util.*;  
class Binary_convert_to_Decimal
{ 
  
    static int binaryToDecimal(String n) 
    { 
        String num = n; 
        int dec_value = 0; 
      
       
        int base = 1; 
      
        int len = num.length(); 
        for (int i = len - 1; i >= 0; i--) 
        { 
            if (num.charAt(i) == '1') 
                dec_value += base; 
            base = base * 2; 
        } 
      
        return dec_value; 
    } 
  
  
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(binaryToDecimal(str)); 
    } 
} 
  

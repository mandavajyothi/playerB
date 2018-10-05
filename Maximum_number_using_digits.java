import java.util.*;

class Maximum_number_using_digits
{ 
   
    static int printMaxNum(int num) 
    { 
       
        int count[] = new int[10]; 
          
      
        String str = Integer.toString(num); 
          
      
        for(int i=0; i < str.length(); i++) 
            count[str.charAt(i)-'0']++; 
          
        
        int result = 0, multiplier = 1; 
          
        
        
        for (int i = 0; i <= 9; i++) 
        { 
            while (count[i] > 0) 
            { 
                result = result + (i * multiplier); 
                count[i]--; 
                multiplier = multiplier * 10; 
            } 
        } 
       
       
        return result; 
    } 
      
   
    public static void main(String[] args)  
    { 
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println(printMaxNum(num)); 
    } 
}

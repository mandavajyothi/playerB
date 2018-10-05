import java.util.*;
class Sides_of_a_triangle
{ 
 public static int checkValidity(int a,int b, int c) 
    { 
         
        if (a + b <= c || a + c <= b || b + c <= a) 
            return 0; 
        else
            return 1; 
    } 
  
   
    public static void main(String args[]) 
    { 
  
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
      
        if ((checkValidity(a, b, c)) == 1) 
            System.out.print("yes"); 
        else
            System.out.print("no"); 
          
    } 
} 

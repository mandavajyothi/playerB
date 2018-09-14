import java.util.*;
class Factorial_of_the_number{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact=1;  
  int number,number1;
  Scanner sc=new Scanner(System.in);
  number=sc.nextInt();
  number1=sc.nextInt();
      
  fact = factorial(number)/factorial(number1);   
  System.out.println(fact);    
 }  
}  

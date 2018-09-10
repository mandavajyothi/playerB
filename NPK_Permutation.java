import java.io.*;
import java.util.*;
import java.math.*; 
  
class NPK_Permutation
{ 
      
  
    static int permutationCoeff(int num,  
                                int ka) 
    { 
        int P[][] = new int[num + 2][ka + 2]; 
      
         for (int i = 0; i <= num; i++) 
        { 
            for (int j = 0;  
                 j <= Math.min(i, ka);  
                 j++) 
            { 
             
                if (j == 0) 
                    P[i][j] = 1; 
      
                          else
                    P[i][j] = P[i - 1][j] +  
                               (j * P[i - 1][j - 1]); 
      
                    P[i][j + 1] = 0; 
            } 
        } 
        return P[num][ka]; 
    } 
      
   
    public static void main(String args[]) 
    { 
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(permutationCoeff(n, k) ); 
    } 
} 
  

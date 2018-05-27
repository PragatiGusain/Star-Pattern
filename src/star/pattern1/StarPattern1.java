/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package star.pattern1;

/**
 *
 * @author Pragati Gusain
 */
import java.util.*;
public class StarPattern1 {

    
    public static void main(String[] args) 
    {
      int i,j;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the string:");
      int n=s.nextInt();
      for(i=1;i<=n;i++)
      {
          for(j=1;j<=i;j++)
          {
              System.out.print("*");
          }
          System.out.println(" ");
      }
    }
    
}

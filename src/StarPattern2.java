/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pragati Gusain
 */
public class StarPattern2 
{
  public static void main(String[] args) 
   {
      int i,j,k,l;
      for(i=1;i<=3;i++)
      {
          for(j=2;j>=i;j--)
          {
              System.out.print(" ");
          }
          for(l=2;l<=i;l++)
          {
            System.out.print("*");  
          }
          for(k=1;k<=i;k++)
          {
              System.out.print("*");
          }
          System.out.println(" ");
      }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumeroc;

/**
 *
 * @author MAHESH
 */



import java.util.Scanner;
public class TS3
{
    public static void main(String []args)
    {
        int i,j,k;
        Scanner s1=new Scanner(System.in);
        System.out.println("enter number");
        k=s1.nextInt(); 
        for(i=1;i<=k;i++)
        {
            for(j=1;j<k;j++)
            {
                System.out.print(" ");
            }
            
            for(j=1;j<=i;j++)
            	if(j==1 || j==i)
                System.out.print("* ");
            	else if(i%2==1 && j==i/2+1)
            	{
                  System.out.print("*");
            	}
             	else if(i%2==0 && j==i/2)
             	{
                  System.out.print("*");
            	}
            	else 
                System.out.print(" ");
	    System.out.println(" ");
        }

    }
    
}

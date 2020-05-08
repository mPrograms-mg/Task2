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
public class TS2
 {
	public static void main(String[] args) 
    {
		int a,i,j,k,l;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a number ");
		a = s1.nextInt();
		for(i=1, k=10; i<=a; i++,k--) 
      	  	{
			/*for(j=1; j<=a; j++) 
            		{
				if(j<=k-i) 
                		{
					if(j==1 && i>=1 && i<=a) 
                    			{
						System.out.print(" "+i);
					} 
                    			else 
                    			{
						System.out.print(" "+j);
					}
				}
			*/
			for(j=a+1,l=10; j<=a+4; j++) 
            		{
				if(j<=k-i) 
                		{
					System.out.print(" "+(l-j));
				}
			}System.out.println(" ");
			
		}
	}

	
}


/*
import java.util.Scanner;
public class TS2
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter the number of ro5ws: "); //takes input from user
 
    int rows = sc.nextInt();
 
    for (int i= rows-1; i>=0 ; i--)
    {
    for (int j=1; j<=i; j++)
    {
    System.out.print(i+" ");
    }
    System.out.println();
    }
    sc.close();
    }
    }
*/

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
public class TS5 
{
	public static void main(String[] args) 
    	{
		boolean k;
		int a;
        	Scanner s1=new Scanner(System.in);
		System.out.print("Enter input = ");
		a = s1.nextInt();
		for(int i=1; i<=a; i++) 
       	 	{
		    if(i%2 == 0) 
            	    {
				k = true;
				for(int j = 1; j <= a + 6; j++) 
                		{
					if(j >= (a+1)-i && j<=a+(i-1) && k)
                    			{
						for(int n=1; n<=i && k; n=n+2)
                         			{
							System.out.print(n);
							k = false;
						}
					} 
                    			else 
                    			{
						System.out.print(" ");
						k = true;
					}
				}
				
			}
			if(i%2!=0) 
            		{
				k = true;
				for(int j=1; j<=a+6;j++) 
                		{
					if(j>=(a+1)-i && j<=a+(i-1) &&k) 
                    			{
						System.out.print("*");
						k = false;
					} 
                    			else 
                    			{
						System.out.print(" ");
						k = true;
					}
				}
				
			}System.out.println(" ");
		}
	}

}


/*import java.util.Scanner;
public class TS5
{
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Input ");
 
    int rows = sc.nextInt();        
    for (int i= 0; i<= rows-1 ; i++)
    {
        for (int j=0; j<=i; j++)
        {
            System.out.print(" ");
        }
        for (int k=0; k<=rows-1-i; k++)
        {
            System.out.print(k+" ");
        }
        System.out.println();
    }
    sc.close();
 
}
}*/
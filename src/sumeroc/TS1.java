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
class TS1
{
  public static void main(String abc[])
  {
    Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Input=");
	int input = sc.nextInt();
	
                //Printing upper half of the pattern
		for (int i = input; i >= 1; i--) 
                {
		
                    int alphabet=65; 
			
                    for (int j = 1; j <= i; j++)
                    {
                            System.out.print(" "+(char)alphabet);
                            alphabet++;    
                    }		
                    System.out.println();
                    
                }
                
		
	
                 //Printing lower half of the pattern
                for (int i = 2; i <= input; i++) 
                {
		  
                    int alphabet=65; 
		  
                    for (int j = 1; j <= i; j++)
                    {
                            System.out.print(" "+(char)alphabet);
                            alphabet++;
                    }
                    System.out.println();
                }
		
    }
}
/*import java.util.Scanner;
 public class TS1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        //Printing upper half of the pattern
         
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        //Printing lower half of the pattern
         
        for (int i = 2; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        //Closing the resources
         
        sc.close();
    }
}

/*
class TS1
{
  public static void main(String abc[])
  {
   for(int i=1;i<6;i++)
   {
   int alphabet=65;                          //ASCII value of A
   for(int j=1;j<=i;j++)
   {
   System.out.print((char)alphabet);
   alphabet++;
   }
   System.out.println();
   }
  }
}*/
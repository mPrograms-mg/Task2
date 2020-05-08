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

public class TS6
{
    public static void main(String[] args) 
    {
          
        Scanner in = new Scanner(System.in);  
        
        System.out.print("Enter the number=");
        int num = in.nextInt();
          
        for (int i = 1; i <= num; i++) 
        {
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
              
            for (int k = i; k <= num; k++)
            { 
                System.out.print(k+" "); 
            } 
            System.out.println(); 
        
         } 
         
        for (int i = num-1; i >= 1; i--) 
        {
                for (int j = 1; j < i; j++) 
                {
                
                    System.out.print(" ");
                }
                for (int k = i; k <= num; k++)
                {
               
                    System.out.print(k+" ");
                }
              
                System.out.println();
        }
         
    }
}
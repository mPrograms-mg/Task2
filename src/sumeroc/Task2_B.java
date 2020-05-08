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
import java.util.*;

public class Task2_B
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("------Simple Calculator--------");
		
		double num1;
		double num2;
		double Ans;
		
		System.out.println("1) Addition(+)");
		System.out.println("2) Subscrition(-)");
		System.out.println("3) Multification(*)");
		System.out.println("4) Division(/)");
                System.out.println("5) Square Root");
                System.out.println("6) Module (%)");
		
                System.out.print("Select Operation=");
		int ch = in.nextInt();
		
		
		
		switch(ch)
		{
			 case 1: 
                                        System.out.print("Enter the Number1 = ");
                                        num1 = in.nextInt();
		
                                        System.out.print("Enter the Number2 = ");
                                        num2 = in.nextInt();
                                        
                                        Ans = num1 + num2;
					System.out.print("Addition(+)="+Ans);
				
				break;
			
			 case 2:
					 
                                        System.out.print("Enter the Number1 = ");
                                        num1 = in.nextInt();
		
                                        System.out.print("Enter the Number2 = ");
                                        num2 = in.nextInt();
		
                                        Ans = num1-num2;
					System.out.println("Subscrition(-)="+Ans);
				
				break;	
			
			case 3:
                            
                                        System.out.print("Enter the Number1 = ");
                                        num1 = in.nextInt();
		
                                        System.out.print("Enter the Number2 = ");
                                        num2 = in.nextInt();
		
                                        Ans = num1*num2;
					System.out.println("Multification(*)="+Ans);
				
				break;

			case 4:
                                        System.out.print("Enter the Number1 = ");
                                        num1 = in.nextInt();
		
                                        System.out.print("Enter the Number2 = ");
                                        num2 = in.nextInt();
		
					Ans = num1/num2;
					System.out.println("Division(/)="+Ans);
				
				break;
                           
                        case 5:
                                
                                        System.out.print("Enter Number for Square= ");
                                        double num3 = in.nextInt();
                                       
                                        Ans = num3*num3;
                                        System.out.print("Square Root="+Ans);
                                 
                                break;
                            
                        case 6:
                            
                                        System.out.print("Enter the Number1 = ");
                                        num1 = in.nextInt();
		
                                        System.out.print("Enter the Number2 = ");
                                        num2 = in.nextInt();
		
					Ans = num1%num2;
					System.out.println("Module(%)="+Ans);
				
				break;
				
			default:
					
                                        System.out.println("Wrong Choice");
				break;	
		
		}
		
		
		
	}
}	
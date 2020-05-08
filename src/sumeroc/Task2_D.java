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

public class Task2_D
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("------Weight Conversion Tool--------");
		 
		System.out.println("1)Convert  Kilograms to Pounds");
		System.out.println("2)Convert  Kilograms to Ounces");
		System.out.println("3)Convert  Kilograms to Grams");
		System.out.println("4)Convert  Kilograms to Stones");
		
		System.out.print("Enter Kilograms Value=");
		double kg = in.nextInt();
		
		
		System.out.print("Select Choice=");
		int ch= in.nextInt();
		
		
		switch(ch)
		{
			 case 1: 
					double pd = kg*2.2046;
					System.out.print("Convert  Kilograms to Pounds="+kg);
				
				break;
			
			 case 2:
					double oz=kg*35.274	;
					System.out.println("Convert  Kilograms to Ounces="+oz);
				
				break;	
			
			case 3:
					double g=kg*1000;
					System.out.println("Convert  Kilograms to Grams="+g);
				
				break;

			case 4:
					double st=kg*0.1574;
					System.out.println("Convert  Kilograms to Stones="+st);
				
				break;
				
			default:
					System.out.println("Wrong Choice");
				break;	
	
		}
	
	}	
}

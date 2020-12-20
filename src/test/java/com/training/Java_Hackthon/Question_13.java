/*Q13. Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)*/
package com.training.Java_Hackthon;

import java.util.Scanner;

public class Question_13 {

	
		public static String reverse(String Str)
		{
		      String rev = "";
			  for (int i= Str.length()-1; i>=0 ; i--)
			    {
			    	rev= rev + Str.charAt(i);
			    }
			    return rev;
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
			System.out.print("Enter the String : ");
		    String str = sc.next();
		    
		//    String rev =reverse(str);
		    System.out.println("Reverse String :" +reverse(str));
		
		    
		  

	}

}

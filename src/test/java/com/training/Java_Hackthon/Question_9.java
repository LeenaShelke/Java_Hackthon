/*Q9. How can we make String Lower case to Upper case?*/
package com.training.Java_Hackthon;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String in Lowercase: ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for(int a = 0; a < ch.length; a++)
	      {
	         if(ch[a] >= 'a' && ch[a] <= 'z')
	         {
	            ch[a] = (char)((int)ch[a] -32);
	           
	         }
	   
	      }
		System.out.print("Converted String in Uppercase: ");
	      for(int a = 0; a < ch.length; a++)
	      {
	         System.out.print(ch[a]);
	      }
	    sc.close();
	   
	}
		
	}

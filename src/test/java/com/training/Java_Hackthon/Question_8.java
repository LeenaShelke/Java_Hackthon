/*Q8. How can we make String upper case to lower case?*/
package com.training.Java_Hackthon;

import java.util.Scanner;

public class Question_8 {
	public static String toLowerCase(String str)
	{
		
		for (int i=0;i<str.length();i++)
		{
			int char1 = str.charAt(i);
			
			if (char1>64&&char1<91)  //Convert into lowercase
			{
				char1 = char1+32;
				
				System.out.print((char)char1) ;
			}
			else if (char1>96&&char1<123)// for special keyboard keys Alt,tab
			{
				System.out.print((char)char1);
			}
			else if (char1==32)  //For space character
			{
				System.out.print(" ");
			}
		}
		return str;
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String in Uppercase: ");
		String str = sc.nextLine();
		System.out.print("String converted into Lowercase: ");
		toLowerCase(str);
	}


}

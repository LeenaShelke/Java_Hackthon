/*Q28. WJP to find factorial of a number using recursion*/
package com.training.Java_Hackthon;

import java.util.Scanner;

public class Question_28 {

	
		static int fact(int n)
		{
			int result =1;
			while(n!=1)
			{
				result = result*n;
				n--;
			}
			return result;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int num = scan.nextInt() ;
			int result = fact(num);
			System.out.println("Facotrial of " + num + " is " + result);

		}
	}



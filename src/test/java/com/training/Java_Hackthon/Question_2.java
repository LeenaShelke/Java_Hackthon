/*Q2. write a program to find factorial (Non Recursive)*/
package com.training.Java_Hackthon;

import java.util.Scanner;

public class Question_2 {

		static int fact(int n)//Non-recursive function to find factorial of a given number
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

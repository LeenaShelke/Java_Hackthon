/*Q1. Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true*/   
package com.training.Java_Hackthon;
import java.util.Scanner;
public class Question_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter boolean value for a:");
		boolean a= sc.nextBoolean();
		System.out.print("Enter boolean value for b:");
		boolean b= sc.nextBoolean();
		System.out.print("Enter boolean value for c:");
		boolean c = sc.nextBoolean();
	
		if(a==true && b == true && c==true)
		{
			System.out.println("a,b and c variables are true");
		}
		else if(a==true && b == true)
		{
			System.out.println("a and b variables are true");
		}
		else if(b==true && c== true)
		{
			System.out.println("b and c variables are true");
		
		}
		else if(a==true && c==true)
		{
			System.out.println("a and c variables are true");
		}
		else
		{
			System.out.println("Enter two variables(a,b,c) atleast true");
		}

	}

}

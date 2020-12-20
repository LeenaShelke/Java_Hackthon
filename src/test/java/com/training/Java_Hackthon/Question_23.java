/*Q23. WJP to differentiate input as string, int or bool*/
package com.training.Java_Hackthon;

import java.util.Scanner;

public class Question_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Input :");
		if (input.hasNextInt()) System.out.println("This input is of type Integer.");
		else if (input.hasNextFloat()) System.out.println("This input is of type Float.");
		else if (input.hasNextLine()) System.out.println("This input is of type string."); 
		else if (input.hasNextDouble()) System.out.println("This input is of type Double."); 
		else if (input.hasNextBoolean()) System.out.println("This input is of type Boolean.");  

	}

}

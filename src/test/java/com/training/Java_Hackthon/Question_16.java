
/*Q16. Write a method that will remove given character from the String?*/
package com.training.Java_Hackthon;

import java.util.Scanner;

public class Question_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.next();
		System.out.println("Enter character to remove:");
		String ch = sc.next();
		str = str.replaceAll(ch, "");
		System.out.println(str);
		
	}

}

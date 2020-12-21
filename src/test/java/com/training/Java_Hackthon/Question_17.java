/*Q17. WJP to find total number of integers, uppercase and lowercase character in the give string*/


package com.training.Java_Hackthon;

import java.util.Scanner;

public class Question_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		int totalChar = str.length();  
        int upperCase = 0;  
        int lowerCase = 0;  
        int digits = 0;  
        int others = 0;  
        for (int i = 0; i < totalChar; i++) {  
            char ch = str.charAt(i);  
            if (Character.isUpperCase(ch)) {  
                upperCase++;   
            }  
            else if (Character.isLowerCase(ch)) {  
                lowerCase++;  
            }  
            else if (Character.isDigit(ch)) {  
                digits++;  
            }  
        }
        System.out.println("Uppercase Count:"+ upperCase);
        System.out.println("Lowercase Count:"+ lowerCase);
        System.out.println("Digits Count:"+ digits);

}

}
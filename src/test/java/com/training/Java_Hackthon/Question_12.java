/*Q12. Write a program to check palindrome (MalayalaM) for both numbers and string?*/
package com.training.Java_Hackthon;

import java.util.Scanner;

public class Question_12 {

	static boolean isPalindrome(String str) 
	    { 
	        // Pointers pointing to the beginning 
	        // and the end of the string 
	        int i = 0, j = str.length() - 1; 
	  
	        // While there are characters toc compare 
	        while (i <= j) { 
	  
	            // If there is a mismatch 
	            if (str.charAt(i) != str.charAt(j)) 
	                return false; 
	  
	            // Increment first pointer and 
	            // decrement the other 
	            i++; 
	            j--; 
	        } 

	        // Given string is a palindrome 
	        return true; 
	    } 
	
	    public static void main(String[] args) 
	    { 
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Enter a String :");
	    	 String str = sc.next(); 
	   	  
		        if (isPalindrome(str)) 
		            System.out.print("String is Palindrome"); 
		        else
		            System.out.print("String is not Palindrome"); 
	    } 
	
	}



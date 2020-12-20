/*Q4. Given an array of integers check the Palindrome of the series.*/
package com.training.Java_Hackthon;

import java.util.Scanner;

public class Question_4 {
	public static boolean isPalindrome(int[] arr)
	{
		  int i = 0, j = arr.length - 1; 
		  
	        // While there are characters toc compare 
	        while (i <= j) { 
	  
	            // If there is a mismatch 
	            if (arr[i] != arr[j]) 
	                return false; 
	  
	            // Increment first pointer and 
	            // decrement the other 
	            i++; 
	            j--; 
	        } 
	       	return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc=new Scanner(System.in);  
		int[] array = new int[5];  
		System.out.print("Enter five integers: ");  
		for(int i=0; i<array.length; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.nextInt();  
		}  
	    System.out.print("{");
		 for(int i:array)
		 {
			 System.out.print(i +"," );
		 }
		 System.out.print("}");
        if (isPalindrome(array)) 
        	
            System.out.print(" Array of Integers is Palindrome"); 
        else
            System.out.print("Array of Integers is not Palindrome"); 

	}

}

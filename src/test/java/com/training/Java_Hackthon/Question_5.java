/*Q5. Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.*/
package com.training.Java_Hackthon;

import java.util.Arrays;
import java.util.Scanner;

public class Question_5 {

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
		 
		System.out.println("\nDuplicate elements in given array:");  
		    //Searches for duplicate element  
		    for(int i = 0; i < array.length; i++) 
		    {  
		    	int j;
		        for(j = 0; j < i; j++)
		        {  
		            if(array[i] == array[j])  
		            	
		                break;    
		            		            	
		        } 
		        if (i!=j)  //Print duplicate number only once
		        	System.out.print(array[i]+" ");
		        
		     }  
		    System.out.println("\nUnique elements in given array:");  
		   // Searches for Unique element  
		 		 	
		       for (int i = 0; i < array.length; i++) 
		         { 
		             // Check if the picked element is already printed 
		        	 int j;
		             for ( j = 0; j < i; j++) 
		             {
		            	 if (array[i] == array[j]) 
		            		 break; 
		            	 
		             }
		             if (i == j) 
      		            System.out.print( array[i] + " "); 
		             		             
		         } 
   		 
		     } 
 	
	}



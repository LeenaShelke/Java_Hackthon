/*Q24. Write a program which inputs a positive natural number N and 
 * prints the possible consecutive number combinations, which when added give N.   INPUT: N = 9  OUTPUT: 4 + 5     2 + 3+ 4
 */

package com.training.Java_Hackthon;

import java.util.Scanner;

public class Question_24 {

			static void printSums(int N) 
			    { 
			        int start = 1, end = 1; 
			        int sum = 1; 
			      
			        while (start <= N/2) 
			        { 
			            if (sum < N) 
			            { 
			                end += 1; 
			                sum += end; 
			            } 
			            else if (sum > N) 
			            { 
			                sum -= start; 
			                start += 1; 
			            } 
			            else if (sum == N) 
			            { 
			                for (int i = start;i <= end; ++i) 
			                {
			                	
			                     System.out.print(i  + " "); 
			                }
			      
			                System.out.println(); 
			                sum -= start; 
			                start += 1; 
			            } 
			        } 
			    } 
			  
	
			    public static void main (String[] args) 
			    { 
			    	Scanner input = new Scanner(System.in);
					System.out.println("Enter Input :");
					int num = input.nextInt();
			            printSums(num); 
			    } 
				
	}



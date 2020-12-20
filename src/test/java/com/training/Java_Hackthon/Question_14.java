/*Q14. Given a string print the reverse of the words string.(Input: Java Code Output: Code Java)*/
package com.training.Java_Hackthon;

import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.print("Enter the String :");
	      Scanner sc = new Scanner(System.in);
	      String str = sc.nextLine();
	      String[] words = str.split(" ");
	      String revString = "";
	     
	      for (int i= words.length-1 ; i >= 0; i--)
	      {
	    	  String word = words[i];
	    		    	  
	    	  revString = revString + word + " ";
	      }
	      System.out.println("Reverse words in the String : "+ revString);
		}

	}



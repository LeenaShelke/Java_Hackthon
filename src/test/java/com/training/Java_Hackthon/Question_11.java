/*Q11. How to Split String in java?*/
package com.training.Java_Hackthon;

public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "3435-3773-3838"; 
       System.out.println(str);
       /* Split method breaks a given string around 
       matches of the given regular expression*/
       String[] arrOfStr = str.split("-"); 
       
       for (String a : arrOfStr) 
           System.out.println(a); 
    		   
	}

}

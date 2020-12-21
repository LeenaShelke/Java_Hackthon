/*Q19. WJP to display number of occurrence of all character*/
package com.training.Java_Hackthon;

import java.util.Scanner;
 
public class Question_19 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String :");
	String str = sc.nextLine();
	str= str.toLowerCase();
    
    for ( char ch ='a';ch<='z';ch++)
    {
   	 int cnt = 0;
      	 for (int i = 0;i<str.length();i++)
    
      	 	{
      		 	if (ch==str.charAt(i) && str.charAt(i)!=' ')
   			 {
   		  		cnt++;
   			 }
      	 	}
      	if (cnt!=0)
       {
      	 System.out.println(ch + "\t\t"+cnt);
       }
    }
}
}

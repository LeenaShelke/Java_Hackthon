/*Q7. What are different ways to create String Object?*/
package com.training.Java_Hackthon;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";  //Using String literal
		System.out.println("Using Literal way:"+str);
		String str1 = new String("Hello");//Using new keyword
		System.out.println("Using New keyword:"+str1);
		char ch[]={ 'H','e','l','l','o','!'}; //Using character array
		String str2=new String(ch);
		System.out.println("Using Character array:"+str2);

		
		
	}

}

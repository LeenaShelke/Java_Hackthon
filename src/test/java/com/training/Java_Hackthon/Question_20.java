/*Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string*/
package com.training.Java_Hackthon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		int cnt = 0;
         Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i =0;i<str.length();i++)
        {
        	if (map.containsKey(str.charAt(i)))
        	{
        		int count = map.get(str.charAt(i));
        		count++;
        		map.put(str.charAt(i), count);
        	}
        	else
        	{
        		map.put(str.charAt(i), 1);
        	}
         
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet())
        {
        	if (entry.getValue()>1 && entry.getKey()!=' ')
        	{
        		
        	    
        		System.out.println(entry.getKey() + " " +entry.getValue());
        	}
        }
       
           }
		
        }

	
	
  

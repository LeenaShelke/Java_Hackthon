/*Q26. WJP to merge two sorted array.(Do not use third array) 
 * array1[10] = 1,2,4,6,9,10 array2[4] = 3, 5,7,8 After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10
 */


package com.training.Java_Hackthon;

import java.util.*;
public class Question_26 {

	public static void main(String[] args) {
		
		 ArrayList<Integer> list1 = new ArrayList<Integer>(); 
	            { 
	                list1.add(12); 
	                list1.add(16); 
	                list1.add(9); 
	                list1.add(7); 
	                list1.add(4); 
	           
	            } 
	    System.out.println(list1);
	    ArrayList<Integer> list2 = new ArrayList<Integer>(); 
        { 
            list2.add(9); 
            list2.add(16); 
            list2.add(9); 
            list2.add(7); 
            list2.add(4); 
       
        } 
        System.out.println(list2);
        merge(list1,list2);
	}
	    
		public static void merge (ArrayList<Integer> list1, ArrayList<Integer> list2)
		{
		    list1.addAll(list2);
		    Collections.sort(list1);
		    System.out.println(list1);
		}
	
		
	}
	
	  


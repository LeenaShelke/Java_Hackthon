/*Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.*/
package com.training.Java_Hackthon;

public class Question_25 {

		 public static int binarySearch(int arr[], int first, int last, int key){  
		        if (last>=first){  
		            int mid = first + (last - first)/2;  
		            if (arr[mid] == key){  
		            return mid;  
		            }  
		            if (arr[mid] > key){  
		            return binarySearch(arr, first, mid-1, key);//search in left subarray  
		            }else{  
		            return binarySearch(arr, mid+1, last, key);//search in right subarray  
		            }  
		        }  
		        return -1;  
		    }  
		    public static void main(String args[]){  
		        int arr[] = {10,20,30,40,50};  
		        int key = 30;  
		        int last=arr.length-1;  
		        System.out.println(key +" Element found in array[10,20,30,40,50]");
		        int result = binarySearch(arr,0,last,key);  
		        if (result == -1)  
		            System.out.println("Element is not found!");  
		        else  
		            System.out.println("Element is found at index: "+result);  
		    }  
	}



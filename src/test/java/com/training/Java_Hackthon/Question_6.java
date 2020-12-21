/*Q6. WJP to perform ascending order Selection sort*/
package com.training.Java_Hackthon;

import java.util.Scanner;

public class Question_6 {
	static void Selectionsort(int arr[])
	{
		int n= arr.length;
		int temp;
		for (int i = 0; i<n-1; i++) //First iteration is length of array minus 1 times 
		{
	
		    int min = i;
			for (int j=i+1;j<n;j++)// second iteration is to find minimun value in the unsorted subarray 
					{
				      if( arr[j]<arr[min])
				    	  
				      {
				    	  min = j;			// end of the for loop will find the minimum value  	    
				      }
					}
			if (min!=i)
					{
				        temp = arr[i];
				        arr[i] = arr[min];
				        arr[min]= temp;
					}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int Arr[] = {1,2,1,2,8,6,7,3,7,5,2};
		Scanner sc=new Scanner(System.in);  
		int[] Arr = new int[10];  
		System.out.print("Enter 10 integers: "); 
		for(int i=0; i<Arr.length; i++)  
			{  
				//reading array elements from the user   
				Arr[i]=sc.nextInt();  
			}
		
		System.out.print("Array before Selection sort: ");
		for(int i : Arr)
			{ 
			System.out.print(i+" ");
			}
		 Selectionsort(Arr);
	        
        System.out.print("\nArray after Selection sort: ");
        for(int i : Arr)
		{
		System.out.print(i +" ");
		}
	}
}

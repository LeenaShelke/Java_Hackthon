//. WJP to perform Merge sort using recursion 
package com.training.Java_Hackthon;

public class Question_29 {

	static void Mergesort(int arr[])
	{
		int newarr[] =new int[arr.length];
		Mergesort(arr,newarr,0,arr.length-1);
	}
	
	static void Mergesort(int arr[],int newArr[],int lb,int ub)
	{
		
				
		if (lb<ub)
		{
			int med;
			med= (lb+ub)/2;
			Mergesort(arr,newArr,lb,med);//sort left half
			Mergesort(arr,newArr,med+1,ub);//sort right half
			merge(arr,newArr,lb,med,ub);// Merge them 
		}
		
	}
  static void merge(int arr[],int helper[],int lb,int med,int ub) {
    	//copy both halves into helper array
    	for (int i=lb; i<=ub;i++)
    	{
    		helper[i]= arr[i];
    	}
    	int helperleft = lb;
    	int helperright = med+1;
    	int current = lb;
    	/* Iterate through helper array.compare left and right hand 
    	 * 
    	 */
    	while(helperleft<=med && helperright<=ub)
    	{
    		if (helper[helperleft]<=helper[helperright])
    				{
    			       arr[current]=helper[helperleft];
    			       helperleft++;
    				}
    		else
    		{
    			arr[current]= helper[helperright];
    			helperright++;
    			
    		}
    		current++;
    	}
    		
		//Copy the rest of the left side of the array into th target arrray
		int remaining = med-helperleft;
		for (int i=0;i<=remaining;i++)
		{
			
			arr[current+i]= helper[helperleft+i];
		}
	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[] = {1,2,3,7,5,2};
		
		System.out.print("Array before Merge sort :");
		for(int i: Arr)
			{
			
			System.out.print(i +" ");
			}
		 Mergesort(Arr);
	       System.out.println(); 
        System.out.print("Array after Merge sort : ");
        for(int i : Arr)
		{
		System.out.print(i +" ");
		}
       
	}


}

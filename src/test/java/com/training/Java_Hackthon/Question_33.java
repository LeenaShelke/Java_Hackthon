package com.training.Java_Hackthon;
/*Q33. A circus is designing a tower routine consisting of people standing 
 * atop one another’s shoulders. For practical and aesthetic reasons, each person must
 *  be both shorter and lighter than the person below him or her. Given the heights and 
 *  weights of each person in the circus, write a method to compute the largest possible
 *   number of people in such a tower. EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90)
 *    (75, 190) (60, 95) (68, 110) Output: The longest tower is length 6 and includes from 
 *    top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)
 */

public class Question_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] array= {
				{65,100},
				{70,150},
				{56,90},
				{75,190},
				{60,95},
				{68,110}
				};

				java.util.Arrays.sort(array, new java.util.Comparator<double[]>() 
				{
				    public int compare(double[] a, double[] b) {
				        return Double.compare(a[0], b[0]);
				    }
				});
				System.out.println("Circus Tower with heavy weight and tallest at the bottom");
				for(int i = 0; i<array.length; i++)
				{
				    for(int j = 0; j<array[0].length; j++)
				    {
				        System.out.print(array[i][j]+" ");
				    }
				    System.out.println();
				}
	}

}

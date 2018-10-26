/**
 * Given a integer n. We have n*n values of a 2-d array, and  n values of 1-d array.
 * Task is to find the sum of the diagonal values of the 2-d array and 
 * the max element of the 1-d array and print them with space in between.
 * Input: First line of input contains a single integer T which denotes the number of test cases.
 * T test cases follows, first line of each test case contains a integer n. 
 * Second line consists of n*n spaced integers. 
 * Third and last line consists of n spaced integers.
 * Output: Print the sum of the diagonal elements 
 * and the maximum number of the 1-d array with spaces in between.
 *  
 */

package code_world_i;

import java.util.Scanner;

public class Prog2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Get no of testcases
		int t = sc.nextInt();
		
		//Get input for t testcases
		for( int i = 0; i < t ; i++) {
			
			int n = sc.nextInt();
			
			int[] arr1d = new int[n];
			int[][] arr2d = new int[n][n];
			
			for (int j = 0 ; j <n; j++)
				for (int k = 0; k < j ; k++)
					arr2d[j][k] = sc.nextInt();
			
			for ( int l = 0 ; l < n ; l++)
				arr1d[l]=sc.nextInt();
			
			System.out.println(diagonal(arr2d)+""+max(arr1d));
		}
		
	}
	
	public static int diagonal(int[][] arr ) {
		
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++)
			sum += arr[i][i];
		return sum;
	}
	
	public static int max(int[] arr) {
		int max = 0;
		for(int i = 0; i < arr.length ; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}
}

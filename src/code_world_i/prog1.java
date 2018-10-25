/* Pair with given sum in a sorted array
 * You are given an array of size n
 * You need to find all pairs in the array that sum to a number K
 * If no pair exist then output would be -1
 * The elements are distinct and in sorted order
 * 
 * Problem and solution both from geeksforgeeks.com
 * */

package code_world_i;

import java.util.Scanner;

public class prog1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// take the input for testcase
		int t = sc.nextInt();
		
		// for 0 to t - take array input and desired sum
		
		for ( int i = 0 ; i < t ; i++ ) {
			
			// take the size of array
			int n = sc.nextInt();
			
			// create array of size n
			int arr[] = new int[n];
			
			// create the array from user input
			for ( int j = 0; j < n ; j++ ) {
				arr[j] = sc.nextInt();				
			}
			
			// take the desired sum
			int s = sc.nextInt();
			
			// print the putput
			printPairs(arr,n,s);

		}		
	}
	
	public static void printPairs(int[] arr, int n , int s){
		
		int i = 0;
		int j = n-1;
		
		boolean flag = false;
		
		while(i < j) {
			if(arr[i]+arr[j] == s) {
				flag = true;
				System.out.println(arr[i]+" "+arr[j]+" "+s);
				i++;
				j--;
			}else if(arr[i]+arr[j] < s)
				i++;
			else if(arr[i]+arr[j] > s)
				j--;
		}
		
		if(!flag)
			System.out.println(-1);
	}
}

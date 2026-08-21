/*
Problem Statement:

Given an array of size N-1 containing distinct integers in the range [1, N], find the missing number from the first N natural numbers.

Example:

Input:4

1235

Output: 4
*/

class MissingNum
{
	public static void main(String [] args)
	{
		int arr [] = {1, 2, 6, 4, 0, 3, 7, 9, 8};
		int n = arr.length;
		int sum = 0;
		int missing =0;
		int actualSum = 0;

		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}

		actualSum = n*(n+1)/2;

		missing = actualSum - sum;	

		System.out.println(missing); 
	}
}
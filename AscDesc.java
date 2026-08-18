/*
Rearrange a given array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

Examples
Input: [8 7 1 6 5 9]
Output: [1 5 6 9 8 7]
Explanation: First three elements are in the ascending order and next three elements are in the descending order.
*/

import java.util.Arrays;
class AscDesc
{
	public static void main(String [] args)
	{
		int arr [] = {8, 7, 1, 6, 5, 9};

		int mid = arr.length/2;

		Arrays.sort(arr);

		for(int i=0; i<mid; i++)
		{
			System.out.print(arr[i]+" ");
		}

		for(int i=arr.length-1; i>=mid; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

Example 1:
Input: nums = [4,1,2,1,2]
Output: 4

Example 2:
Input: nums = [1]
Output: 1
*/

class SingleNo
{
	public static void main(String [] args)
	{
		int [] arr = {4,1,2,1,2};
		int value = 0;

		for(int i=0; i<arr.length; i++)
		{
			value = value ^ arr[i];
		}
		System.out.println(value);
	}
}
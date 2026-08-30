/*
Example 1:-
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 2:-
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
*/

class PlusOne
{
	public static void main(String [] args)
	{
		int [] arr = {4,3,2};	
		//int [] arr = {9,9,9};
		
		for(int i=arr.length-1; i>=0; i--)
		{
			if(arr[i] == 9)
			{
				arr[i] = 0;
			}
			else{
				arr[i]++;
				break;
			}
		}
		
		if(arr[0] == 0)
		{
			int [] arr2 = new int [arr.length +1];
			arr2[0] = 1;
		
			for(int i=0; i<arr2.length; i++)
			{
				System.out.print(arr2[i]+" ");
			}
		}
		else
		{
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]+" ");
			}

		}
	}

}
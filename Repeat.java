//Find all repeating elements in an array

import java.util.Arrays;
class Repeat
{
	public static void main(String [] args)
	{
		int[] arr = {1, 1, 2, 3, 4, 4, 4, 2};
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] == arr[i+1] && (i==0 || arr[i] != arr[i-1]))
			{
				System.out.println(arr[i]);
			}			
		}	
	}
}
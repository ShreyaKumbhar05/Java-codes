/* Given an array of N integers and a positive integer K. The task is to divide an array into 2 subarray from right after the Kth position and slide the left subarray of the K elements to the end. 
Example:
Input-   arr = [10, 20, 30, 40, 50]   n=5, k=2
Output- [30, 40, 50, 10, 20]

Input-   arr = [10, 20, 30, 40]   n=4, k=1
Output- [20, 30, 40, 10]

*/


class divide
{
	public static void main(String [] args)
	{
		int arr [] = {10, 20, 30, 40, 50};
		int n = arr.length;
		int k = 2;

		for(int i=k; i<n; i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0; i<k; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
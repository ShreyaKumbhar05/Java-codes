/*
Q1.Given an array of integers where every element appears even number of times except one element which appears odd number of times, write a program to find that odd occurring element in O(log n) time. The equal elements must appear in pairs in the array but there cannot be more than two consecutive occurrences of an element.

Sample Input:

Array Size:5

22311

Sample Output: 3

Sample Input:

Array Size:3

232

It doesn't have equal elements appear in pairs

Sample Input:

Array Size:7

1122233

It contains three consecutive instances of an element
*/

class occurrence
{
	public static void main(String [] args)
	{
		int [] a= {2, 2, 3, 1, 1};
		int odd=0;

			for(int i=1; i<a.length; i++)
			{
				if(a[i] != a[i-1] && a[i] != a[i+1])
				{					
					odd = a[i];
					if(a[i-1] == a[i+1])
					{
						System.out.println("no");

					}
					
					else
					{
						System.out.println(odd);

					}
					
				}
				else if(a[i-1] == a[i] && a[i] == a[i+1] )
				{
					System.out.println("three consecutive instance of element");
				}
				
			}	
					
	}
}
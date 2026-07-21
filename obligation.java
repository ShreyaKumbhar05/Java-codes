/*Andy wants to go on a vacation to de-stress himself. He can take only one continuous vacation during the next N days, where the days are numbered from 1 to N.

Andy already has M obligations scheduled on specific days. The i-th obligation is on day D[i]. To extend his vacation, Andy is allowed to cancel at most K obligations.

Your task is to determine the maximum number of consecutive vacation days Andy can take after canceling at most K obligations. I

Input Format

The first line contains three integers:

N-Total number of days.

M-Number of scheduled obligations.

K-Maximum number of obligations that can be canceled.

The second line contains M space-separated integers representing the days on which the obligations are scheduled.

Constraints

1 <= N <= 10 ^ 9

0 <= M <= 2 * 10 ^ 5

0 <= K <= M

1 <= D[i] <= N

All obligation days are distinct.

Sample Input

20 5 2

3  8 12 15 18

Sample Output

11
*/

class obligation
{
 	public static void main(String [] args)
	{
		int n=20;
		int m=5;
		int k =0;
		int sum = 0;
		int e= -1;
		int e1 = -1;

		int [] arr= {3, 8, 12, 15, 18};
		int [] arr1 = new int[m];

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
			if(arr[i] + arr[j] == n)
				{
					e = arr[i];
					e1= arr[j];
				}
			}
			
		}	
		System.out.println("Two obligations are cancelled:");					
		System.out.println(e);
		System.out.println(e1);	

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] != e && arr[i] != e1)
			{
				arr1[k] = arr[i];		// arr[k] = 3 & k=1 ,  arr1[k] =15 & k=2 , arr1[k] =18 & k=3 , {3, 15, 18, 0, 0};
				k++;
			}
			
		}

		System.out.println("New array:");
		for(int i=0; i<k; i++)
		{
			System.out.println(arr1[i]);
		}
		int days = arr1[0] -1;			// 3-1 = 2 days (It means two days before first obligation)

		for(int i=1; i<k; i++)
		{
			days = Math.max(days , arr1[i] - arr1[i-1] -1);		// days = 2, arr1[i]=arr1[1]= [15] - arr1[i-1]=arr1[0]-1= [3]  - [1] = 11 
										// Math.max(2 , 11) = 11 (maximum number)
		}
		System.out.println("Vacation days: "+days);
	}
}
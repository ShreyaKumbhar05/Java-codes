// Find the length of longest subarray whose sum is less than or equal to k.
class LongestSubarray
{
	public static void main(String [] args)
	{
		int [] ar = {2, 6, 1, 7, 1, 3};
		int l = 0;
 		int r = 0;
		int maxLen = 0;
		int sum = 0;
		int k= 14;
		while(r < ar.length)
		{
			sum +=ar[r]; 

			if(sum > k)
			{
				sum = sum - ar[l];
				l++;
			}
			if(sum <= k)
			{				
				maxLen = Math.max(maxLen, r-l+1);
				r++;
			}
		}
		System.out.println(maxLen);
	}
}

/*  Another method :

class LongestSubarray
{
	public static void main(String [] args)
	{
		int [] ar = {2, 6, 1, 7, 1};
		int k = 14;
		int maxlen = 0;
		for(int i=0; i<ar.length-1; i++)
		{
			int sum = 0;
			for(int j=i; j<ar.length; j++)
			{
				sum = sum + ar[j];

				if(sum <= k)
				{
					maxlen = Math.max(maxlen , j-i+1);
				}
				else
				{
					break;
				}
			}
		}
		System.out.println(maxlen);
	}
}
*/

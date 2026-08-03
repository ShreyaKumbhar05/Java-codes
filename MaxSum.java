class MaxSum
{
	public static void main(String [] args)
	{
		int [] arr= {2, 5, 1, 8, 2, 9, 1};
		int k=3;
		int maxSum = 0;
		int sum = 0;
		for(int i=0; i<k; i++)
		{	
			sum = sum +arr[i];
		}
		for(int i=k; i<arr.length; i++)
		{
			sum = sum - arr[i-k] + arr[i];

			if(sum > maxSum)
			{
				maxSum = sum;
			}				
		}
		System.out.println(maxSum);	
	}
}
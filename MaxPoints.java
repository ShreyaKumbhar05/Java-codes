// Given an array of cards and each card gives you some points. Pick only 4 cards which gives maximum points. 
// Condition : Either start with left or right.
//   Input:  array = [6, 2, 3, 4, 7, 2, 1, 7, 2]
//   Output:  17

class MaxPoints
{
	public static void main(String [] args)
	{
		int [] a = {6, 2, 3, 4, 7, 2, 1, 7, 2};
		int k=4;
		int sum =0 ;
		int r = a.length-1;
		int maxPoint = 0;

		for(int i=0; i<k; i++)
		{
			sum = sum + a[i];
			maxPoint = sum;
		}
		for(int i=k-1; i>=0; i--)
		{
			sum = sum - a[i];
			sum = sum + a[r];
			r--;
		
			if(sum > maxPoint)
			{
				maxPoint = sum;
			}
		}
		System.out.println(maxPoint);
	}
}

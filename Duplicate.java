// Find the duplicate value from given array.
Return true if array contains duplicate otherwise false. 

import java.util.HashSet;
class Duplicate
{
	public static void main(String [] args)
	{
		HashSet<Integer> set = new HashSet<>();

		int [] nums =  {1, 2, 3, 2};

		boolean num = false;
		for(int i=0; i<nums.length; i++)
		{
			if(set.contains(nums[i]))
			{
				num = true;	
			}
			set.add(nums[i]);
		}
		System.out.println(num);
	}
}


/*
Problem Statement:

A person has many shoes of different sizes, and he wants to arrange them. Your task is to calculate the number of pairs of shoes. Each shoe is represented by its size followed by "L" (Left) or 'R' (Right). A pair is formed when there is one left shoe and one right shoe of the same size.

Example:

Input:8

7L7R 7L 8L 6R 7R 8R 6R

Output: 3

Example 1: Pairs: (7L, 7R), (7L, 7R), (8L, 8R) Total 3
*/

class shoePairs
{
	public static void main(String [] args)
	{
		String [] a = {"7L", "7R", "7L", "8L", "6R", "7R", "8R", "6R"};
		int count = 0;
		boolean [] b = new boolean [a.length];

		for(int i=0; i<a.length; i++)
		{	
			if(b[i])
			{
				continue;
			}

			for(int j=i+1; j<a.length; j++)
			{
				if(!b[j] && a[i].charAt(0) == a[j].charAt(0) && a[i].charAt(1) != a[j].charAt(1) )
				{
					count++;

					b[i] = true;
					b[j] = true;
				   break;
				}
			}
		}
		System.out.println(count);
	}
}
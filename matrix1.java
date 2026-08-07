/*  Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
*/

class matrix1
{
	public static void main(String [] args)
	{
		int x= 15;
		
		int [][] arr= {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30 ,34, 60}};
		int e=0;

		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(arr[i][j]==x)
				{
					e++;
				}
			}
		}
		if(e==1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}
}
/* Que-  Take a matrix as input from the user. Search for a given number x and print indices at which is occurs.  */

import java.util.Scanner;
class twoDArray
{
	public static void main(String [] args)
	{
		int x=5;
		Scanner sc= new Scanner(System.in);
		
		int row = 2;
		int col= 3;
		int [][] arr= new int[row][col];		

		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr [i][j] = sc.nextInt();
				
			}
		System.out.println();
		}

		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				if(arr[i][j] == x)
				{
					System.out.println("Index of x:"+ i + " ," + j);

				} 

				
			}
		System.out.println();
		}

	}
}
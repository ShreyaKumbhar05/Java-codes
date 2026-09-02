
class AdjacentFlower
{
	public static void main(String [] args)
	{
		int [] arr = {1,0,0,0,1};
		int n=2;
		int count =0;

		if(n == 0)
		{
			System.out.println("true");
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == 0)
			{
				if((i == 0 || arr[i-1] == 0) && (i == arr.length-1 || arr[i+1] == 0))
				{
					count++;

					if(count == n)
					{
						System.out.println("true");
					}
					i++;
				}	
			}
		}
		if(count != n)
		{
					System.out.println("false");
		}				
	}
}
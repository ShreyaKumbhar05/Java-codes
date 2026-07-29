// Find the sum of all prime numbers between 1 to 10.

class prime
{
	public static void main(String [] args)
	{
		int n=10;
		int e=0;
		
		for(int i=1; i<=n; i++)
		{	
			int count =0;
			for(int j=1; j<=n; j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			if(count ==2)
			{
				e +=i;
			}
		}
		System.out.println(e);
	}
}
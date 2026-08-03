class factorial
{
	public static void main(String [] args)
	{
		int n = 5;
		
		int e=1;
		for(int i=1; i<=n; i++)
		{
			e= i*e;
		}
		System.out.println(e);
	}
	
}
//Amezon

class drone
{
	public static void main(String [] args)
	{
		int ch1 = 2;
		int ch2 = 3; 
		int del1 = 3;
		int del2 = 1;
		int r1 = 0;
		int r2 = 0;
		int r = 0;

		if(ch1 == ch2)
		{
			r = ((del1+del2) * 2) - 1;
			System.out.println(r);
		}
		else
		{
			if(ch1 %2 ==0)
			{
				r1 = (del1 * 2) - 1;
				//System.out.println(r1);
			}
			else
			{
				r1 = (del1 * 2) ;
				//System.out.println(r1);

			}

			if(ch2 %2 ==0)
			{
				r2 = (del2 * 2) - 1;
				//System.out.println(r2);
			}
			else
			{
				r2 = (del2) * 2 ;
				//System.out.println(r2);

			}
			if(r1 > r2)
			{
				r=r1;
			}
			else{
				r=r2;
			}
			
		}
		System.out.println(r);
	}
}
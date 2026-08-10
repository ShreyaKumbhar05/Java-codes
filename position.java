/*  Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input
 string.
       (*>#): positive integer
       (#>*): negative integer
       (#=*): 0
     Example 1:
     Input 1:
     ###* -> Value of S
     Output :
     0 → number of * and # are equal  */

class position
{
	public static void main(String [] args)
	{
		String s= "####***";

		int count1 =0; 
		int count2 =0;
		for(int i=0; i<s.length(); i++)
		{
			
			if(s.charAt(i)=='#')
			{
				count1++;
			}
		        else
			{
				count2++;
			}

			
		}
		System.out.println(count1);

		if(count1>count2)
		{
			System.out.println("+1");
		}
		else if(count1< count2)
		{
			System.out.println("-1");

		}
		else{
			System.out.println("0");

		}
	}
}
// Palindrome Number

class PalindromNum
{
	public static void main(String [] args)
	{
		int x = 3453;
		int r = 0;
		int temp = x;

		if(x < 0)
		{
			System.out.println("false");
		}
		else{
		while(x != 0)
		{
			r = (r*10) + (x%10);
			x = x/10;

		}
			if(r == temp)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		}
	}
}
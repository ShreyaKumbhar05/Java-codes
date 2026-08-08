class pallindrom
{
	public static void main(String [] args)
	{
		String s= "madam";
		String a = "";

		for(int i=s.length()-1; i>=0; i--)
		{
			a = a + s.charAt(i);
			
		}
		System.out.println(a);
		if(a.equals(s))
		{
			System.out.println("pallindrom");
		}
		else
		{
			System.out.println("no");
		}
	}
}
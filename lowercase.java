// Example 1:
// Input :      ThisIsAnAutomationEra
// Output:      this is an automation era
// Example 2:
// Input:     HeyYou
// Output:    hey you

class lowercase
{
	public static void main(String [] args)
	{
		String s= "ThisIsAnAutomatonEra";
		String result= " ";

		for(int i=0; i<s.length(); i++)
		{
			char ch= s.charAt(i);

			if(ch>='A' && ch<='Z')
			{
				result = result + " ";      
			}    
                      result = result + ch;  
		}
                System.out.println(result);
                System.out.println(result.toLowerCase());
	}
}
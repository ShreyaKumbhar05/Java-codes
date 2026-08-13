import java.util.Stack;
class Parentheses
{
	public static void main(String [] args)
	{
		char [] arr = {'(',')','[',']','{','}'};
		Stack<Character> st = new Stack<>();

		boolean valid = true;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == '(')
			st.push(')');

			else if(arr[i] == '[')
			st.push(']');

			else if(arr[i] == '{')
			st.push('}');
			
			else if(st.pop() != arr[i] || !st.isEmpty())
			{
				valid = false;
			}
		}
		if(valid)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");

		}				
	}
}
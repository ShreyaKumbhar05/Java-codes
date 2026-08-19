import java.util.HashSet;
class UniqueSubstring
{
	public static void main(String [] args)
	{
		String s = "cadbzyabcd";

		HashSet <Character> set = new HashSet<>();
		int l = 0;
		int r = 0;
		int maxlen = 0;

 		while(r < s.length())
		{
			if(set.contains(s.charAt(r)))
			{
				set.remove(s.charAt(l));
				l++;		
			}
			else{
				set.add(s.charAt(r));
				int len = r-l+1;
				maxlen = Math.max(maxlen, len);
				r++;
			}
			
		}
		System.out.println(maxlen);
	}
}
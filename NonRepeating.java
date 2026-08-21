// Find First NonRepeating Number from given array

/*
import java.util.LinkedHashMap;
class NonRepeating
{
	public static void main(String [] args)
	{
		String [] srr = {"10","20","20","10","30","50","10"};

		LinkedHashMap <Integer, Integer> map = new LinkedHashMap<>();
		
		for(String s: srr)
		{
			int n = Integer.parseInt(s);
			int value = map.getOrDefault(n, 0);
			map.put(n, value+1);
		}

		Boolean found = false;

		for(int key: map.keySet())
		{
			if(map.get(key) == 1)
			{
				System.out.println(key);
				found = true;
				break;
			}
		}
		if(!found)
			{
				System.out.println("-1");	
			}
	}
}
*/
class NonRepeating
{
	public static void main(String [] args)
	{
		String s = "10 20 20 10 30 50 10";
			
		char [] arr= s.toCharArray();

		for(int i=0; i<arr.length; i++)
		{
			int count =1;	
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					
				}
			}
		if(count == 1)
		{
			System.out.println(arr[i]);
		}
		}
		
	}
}

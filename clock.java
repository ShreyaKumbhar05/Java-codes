/*  Given a time in 12-hour AM/PM format, convert it to 24-hour military time.
Note:12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock. 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Sample Input:
7:05:45PM

Sample Output:
19:05:45
*/


class clock
{
	public static void main(String [] args)
	{
		String s= "07:05:45PM";

		int ind= s.length()-2;
		System.out.println(ind);
		char e = s.charAt(ind);
		System.out.println(e);
		
		/* String[] sh=s.split(":");
		System.out.println(sh[0]);  */
		
		if(e == 'P')
		{
			System.out.println("pm");
			String str= s.split(":")[0];
			int hr = Integer.parseInt(str);
			hr +=12;
			
			
			String str1= s.split(":")[1];

			String str2= s.split(":")[2];
			System.out.println(hr+ ":"+str1+ ":"+str2);	
		}
		else
		{
			System.out.println(s);
		}
	}
}
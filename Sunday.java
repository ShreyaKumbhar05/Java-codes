// Print Number of Sundays in 13 days.
// Input:mon-> input String denoting the start of the month.    13-> input integer denoting the number of days from the start of the month.

//Output: 2-> number of days within 13 days.


class Sunday
{
	public static void main(String [] args)
	{
		String sday = "Mon";
		int totalDay = 13;
		int day = 0;

		switch(sday)
		{
			case "Sun":
			day =0;
			break;

			case "Mon":
			day =1;
			break;

			case "Tue":
			day =2;
			break;

			case "Wed":
			day =3;
			break;

			case "Thu":
			day =4;
			break;

			case "Fri":
			day =5;
			break;

			case "Sat":
			day =6;
			break;

		}
		int count =0;

		for(int i=0; i<totalDay; i++)
		{
			if(day == 0)
			{
				count++;
			}
			day = (day+1) % 7;
		}
		System.out.println(count);
	}
}
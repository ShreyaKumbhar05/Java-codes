/*
Given an integer n, for every positive integer i <= n, the task is to print,

"FizzBuzz" if i is divisible by 3 and 5,
"Fizz" if i is divisible by 3,
"Buzz" if i is divisible by 5
"i" as a string, if none of the conditions are true.

Examples:

Input: n = 3
Output: ["1", "2", "Fizz"]

Input: n = 20
Output: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"]
*/

import java.util.ArrayList;
class FizzBuzz
{
	public static void main(String [] args)
	{
		ArrayList<String> list = new ArrayList<>();
		int n=16;

		for(int i=1; i<=n; i++)
		{
			if(i % 3 == 0 && i % 5 ==0)
			{
				list.add("FizzBuzz");
			}
			else if(i % 3 == 0)
			{
				list.add("Fizz");

			}
			else if(i % 5 == 0)
			{
				list.add("Buzz");

			}
			else
			{
				list.add(String.valueOf(i));
			}
		}
		System.out.println(list);
	}
}

/*
class FizzBuzz
{
	public static void main(String [] args)
	{
		int n=16;
		String [] arr = new String [n];

		for(int i=1; i<=n; i++)
		{
			if(i % 3 == 0 && i % 5 ==0)
			{
				arr[i-1] = "FizzBuzz";
			}
			else if(i % 3 == 0)
			{
				arr[i-1] = "Fizz";
			}
			else if(i % 5 == 0)
			{
				arr[i-1] = "Buzz";
			}
			else
			{
				arr[i-1] = String.valueOf(i);
			}
		System.out.println(arr[i-1]);
		}
	}
}
*/
		
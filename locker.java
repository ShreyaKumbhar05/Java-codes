/*The Digital Locker System 

A school locker has a 4 digit PIN.
A student enters a number 
if the number:
 - contains exactlly 2 even digits
 - The sum of digit is divisible by 3
 - No digit repeats
then locker opens. Otherwise, it remains locked.
Input :
	a 4-digit integer
output: 
	print OPEN or Locked
*/


import java.util.Scanner;
class locker
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int [] pin = new int[4];
		
		System.out.println("Enter four digit");

		for(int i=0; i<4; i++)
		{
			pin[i]= sc.nextInt();
		}
		int sum=0;
		int c = 0;

		for(int i=0; i<pin.length; i++)
		{
			if(pin[i] %2 ==0)
			{
				c++;
			}
			sum = sum +pin[i];
		}
		
   		boolean repeat= false;

		for(int i=0; i<pin.length; i++)
		{
			for(int j=i+1; j<pin.length; j++)
			{
				if(pin[i] == pin[j])
				{
					repeat = true;
				}
			}
		}  

		if(c==2 && sum%3==0 && !repeat)
		{
			System.out.println("OPEN");
		}
		else
		{
			System.out.println("LOCKED");
		}
	}
}
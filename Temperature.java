// Convert Temperature from Celsius to Fahrenheit and Kelvin.
class Temperature
{
	public static void main(String [] args)
	{
		double celsius = 122.17;
		double kelvin  = celsius +273.15;
		double fahrenheit = celsius * 1.80 + 32.00;
		double arr[] = new double [2];

		arr[0] = kelvin;
		arr[1] = fahrenheit;

		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
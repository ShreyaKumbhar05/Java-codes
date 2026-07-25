// Find Second largest element.

class secondLarge
{
	public static void main(String [] args)
	{
		int arr [] = {3, 9, 2, 7, 4, 1};
                int largest = 0;
                int Slargest = -1;

                for(int i=0; i<arr.length; i++)
		{
			
				if(arr[i]>largest)
				{
                                   largest = arr[i]; 				    
				}
		}
          System.out.println(largest);

              for(int i=0; i<arr.length; i++)
		{
                   if(arr[i] > Slargest && arr[i] != largest)
		   {
			Slargest = arr[i];
		   }
		}
           System.out.println(Slargest);
 	}
}
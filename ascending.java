// Print array in Ascending Order

class ascending
{
	public static void main(String [] args)
	{
		int [] arr = {5, 2, 7, 9, 4, 1};

		for(int i=0; i<arr.length; i++)
    		{
     			 for(int j=i+1; j<arr.length; j++)
      			 {
      		  		if(arr[i] > arr[j])
       				{
         				 int temp= arr[i];
         				 arr[i]= arr[j];
         			 	 arr[j]= temp;
        			}   
      			}
     		 	System.out.println(arr[i]);
    		}
	}

}
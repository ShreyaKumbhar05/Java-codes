class MergeSort
{
	public static void main(String [] args)
	{
		int [] arr1 = {1,3,4,0,0,0};
		int m = 3;
		int [] arr2 = {2, 2, 8};
		int n=3;
		
		int i = m-1;
		int j= n-1;
		int k= m+n -1;

		while(j >= 0)
		{
			if(i >= 0 && arr1[i]>= arr2[j])
            		{
                		 arr1[k]= arr1[i];
                		 i--;
                 		 k--;
          		}
             		else
            		{
              		  	arr1[k]= arr2[j];
                		k--;
                		j--;
            		}
		}
		for(int x=0; x<arr1.length; x++)
		{
			System.out.println(arr1[x] +" ");
		}
	}
}
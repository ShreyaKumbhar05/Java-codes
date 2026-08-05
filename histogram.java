/* Given an array heights where each element represents the heights of histogram bar and width of every bar is 1, find the largest rectangular area that formed inside the histogram. */

public class histogram
{
	public static void main(String [] args)
	{
	    int arr[]= {2, 1, 9, 8, 2, 3};
            int e1= 0;
            int e2 = 0;
            int w =1;
            int r = 0;

	     for(int i=0; i<arr.length; i++)
              {
                if(e1 < arr[i])
                {
                      e1= arr[i];
                      e2= i;
                }  
              }      
              int li = e2 - 1;
              int ri = e2 + 1;

              int eli = arr[li];
              int eri = arr[ri];

              if(eli > eri)
              {
                 r = eli * (w+1);  
              }       
              else
              {
                r = eri * (w + (e1-eri));
              }
             System.out.println(r);
	 }
}
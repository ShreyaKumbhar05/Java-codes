// If  Input: LLLVVPP Output will be L3V2P2.
// task is to generate the optimized activity log.


class OptimizedString
{
	public static void main(String [] args)
	{
		String S= "LLLVVPPPP";
                char arr[]= S.toCharArray();
                 
               for(int i=0; i<arr.length; i++)
               {
		int count= 1;
                 int j=0;
                  for(j=i+1; j<arr.length; j++)
               {
            		if(arr[i] == arr[j])
			{
                           count++;
                          
       			}
                        else  
			{
			  break;
			}
                      
	      }
                   System.out.println( arr[i]);
                   System.out.println(count);
                  
                   i=j-1;
                }
               
               
         }

}
               
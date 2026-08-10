// Find Rank of element

public class rank
{
 public static void main(String[] args)
 {
   int [] arr= {20, 15, 26, 2, 98, 6}; 
   int [] org= new int[6];
   
    for(int i=0; i<arr.length; i++)
    {
      org[i]=arr[i]; 
    }
    
   for(int i=0; i<arr.length; i++)
    {
      for(int j=i+1; j<arr.length; j++)
      {
        if(org[i]>org[j]) 
        { int temp= org[i];
           org[i]=org[j];
           org[j]=temp; 
        }
      }

    }
  
 
   for(int i=0; i<arr.length; i++)
    {
      for(int j=0; j<arr.length; j++)
      {

      if(arr[i]==org[j]) 
      { 
       System.out.println(j+1);
      }
     } 
    }
 }
}

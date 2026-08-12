//Uber

class uber
{
	public static void main(String [] args)
	{
       		int budget= 50;
                int [] pk= {15, 4 };
                int [] pc= {18,5};
                int element= 0;
                int element2 =0;

               for(int i=0; i<pc.length; i++)
                {
                     if(budget % pc[i] ==0)
                     {
                         element = i;
                         element2 = pc[i];        
	             }
                  
       		}

               int d = budget / element2 ;
               System.out.println(d);

               int f= pk[element];
              
               int r= f * d;
               System.out.println(r);
       	}
}

//Output: 40
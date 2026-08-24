// If "abc" -> "xyz" then print true otherwise false.
// example1- "ccd" -> "yyz". then true
// example2- "abc" -> "yyz". then false


class isomorphic
{
	public static void main(String [] args)
	{
 	  String S1= "aab";
          String S2= "xyz";
          int c1=0; 
          int c2 =0;

          for(int i=0; i<S1.length()-1; i++)
          {
             if(S1.charAt(i) == S1.charAt(i+1))
             {
                c1++;
              }
          } 
 
          for(int i=0; i<S2.length()-1; i++)
          {
              if(S2.charAt(i) == S2.charAt(i+1))
             {
               c2++;
             }
          }

          if(c1==c2)
          {
             System.out.println("true");
          }
          else{
             System.out.println("false");

          }

	}

}
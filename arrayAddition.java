/* Write a Java program to add two integer arrays of the same size element by element, store the sum in a third array, and display the resulting array. */


class arrayAddition
{
  public static void main(String []args)
  {

    int a[]={1, 2, 3, 4, 5};
    int b[]={1, 2, 3, 4, 5};

    int [] c= new int[a.length];
    
    for(int i=0; i<5; i++ )
    {
     	c[i]= a[i] + b[i];
     	System.out.println(c[i]);
    }

  }

}
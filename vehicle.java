/*  Example :
Input :
200 -> Value of V (vehicles)
540 -> Value of W (wheels)

Output :
TW(Two Wheelers) =130, FW(Four Wheelers)=70

Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels

Constraints :
2<=W
W%2=0
V<W
Print “INVALID INPUT” , if inputs did not meet the constraints.
*/


class vehicle
{
	public static void main(String [] args)
	{
		int v=200;
		int w=540;

    		int tw=0;
		int fw=0;

		if(2<=w && w%2==0 && v<w)
		{
			fw = (w - 2*v)/2;
			System.out.println(fw);

			tw = v-fw;
			System.out.println(tw);
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}
}


/*
v = tw+fw;
tw= v-fw;

w = 2tw + 4fw;
w = 2(v-fw) + 4fw;
  = 2v - 2fw + 4fw;
w = 2v + 2fw;
fw = (w - 2v)/2;
*/






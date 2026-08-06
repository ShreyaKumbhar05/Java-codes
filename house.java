/*
There are N houses arranged in a straight line. Each house must be painted using one of C available colors.

The cost of painting the i-th house with the j-th color is given by cost[i][j].

The following conditions must be satisfied:

1. Every house must be painted exactly one color.

2. No two adjacent houses can have the same color.

3. The total painting cost must not exceed the given budget B.

Your task is to determine the minimum total painting cost.

If it is impossible to paint all the houses within the given budget, print -1.

Input Format

The first line contains an integer N, the number of houses.

The second line contains an integer C, the number of available colors.

The third line contains an integer B, the maximum allowed budget.

Output Format

Print a single integer:

The minimum total painting cost if it does not exceed B.

Otherwise print -1.

Constraints

1 ≤ N ≤ 1000

2 ≤ C≤50

1 ≤ B ≤ 10^18

1 ≤ cost[i][j] ≤ 10^9

Sample Input 1
3
3
20

153
294
317
Sample Output 1

6

Explanation
Choose colors:

House 1 Color 1 (Cost = 1)

House 2 → Color 3 (Cost = 4)

House 3 Color 2 (Cost = 1)

Total Cost

1+4+1=6 which is within the budget.

Sample Input 2
4
2
5

34

45

26

32

Sample Output 2

-1
*/



class house
{
	public static void main(String[]args){
		int[][]arr={{1,5,3},{2,9,4},{3,1,7}};
 		int houses=3;
		int colors=3;
		int budget=20;
		int index=-1;
		int sum=0;


		for(int i=0;i<arr.length;i++){
			int min=Integer.MAX_VALUE;
			for(int j=0;j<arr[0].length;j++){

				if(arr[i][j]<min&&j!=index){
				min=arr[i][j];

				index=j;
			}
		}

		System.out.println(min);
		sum+=min;
		}


//System.out.println(sum);
		if(sum<budget){
			System.out.println("Minimum total painting cost:"+sum);
		}
		else{
			System.out.println("-1");
		}

}



}
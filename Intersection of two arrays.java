Given two arrays A and B respectively of size N and M. The task is to print the count of elements in the intersection (or common elements) of the two arrays.

For this question, intersection of two arrays can be defined as the set containing distinct common elements between the two arrays.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N and M, N is the size of array A and M is size of array B. The second line of each test case contains N input A[i].
The third line of each test case contains M input B[i].

Output:
Print the count of intersecting elements.

Constraints:
1 ≤ T ≤ 100
1 ≤ N, M ≤ 105
1 ≤ A[i], B[i] ≤ 105

Example:
Input:
4
5 3
89 24 75 11 23
89 2 4
6 5
1 2 3 4 5 6
3 4 5 6 7
4 4
10 10 10 10
20 20 20 20
3 3
10 10 10
10 10 10

Output:
1
4
0
1



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		while(T-->0)
		{
		    int n=in.nextInt();
		    int m=in.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[m];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=in.nextInt();
		    }
		    for(int j=0;j<m;j++)
		    {
		        b[j]=in.nextInt();
		    }
		    Arrays.sort(a);
		    Arrays.sort(b);
		   int flag=-1;
		    for(int i=0;i<n;i++)
		    {
             for(int j=0;j<m;j++)
		      {
		          if(a[i]==b[j])
		          {
		              System.out.print(a[i]+" ");
		              flag=0;
		          }
		      }
		    }
		    if(flag!=0)
		    {
		        System.out.print("Zero");
		    }
                System.out.println();
	    }
   }
}

Given an integer array A of size N, find sum of elements in it.

Input:
First line contains an integer denoting the test cases 'T'. T testcases follow. Each testcase contains two lines of input. First line contains N the size of the array A. The second line contains the elements of the array.

Output:
For each testcase, print the sum of all elements of the array in separate line.

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= Ai <= 100

Example:
Input:
2
3
3 2 1
4
1 2 3 4
Output:
6
10





import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    int T=in.nextInt();
	    int i=0;
	    while(T-->0)
	    {
	        int sum=0;
	        int N=in.nextInt();
	        int a[]=new int[N];
	        for(int j=0;j<N;j++)
	            a[j]=in.nextInt();
            for(int j=0;j<N;j++)
                sum=sum+a[j];
            System.out.println(sum);
	    }
	}
}

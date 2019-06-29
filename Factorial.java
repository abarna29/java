Given a positive integer N. The task is to calculate the factorial of N.

Input:
The first line contains an integer 'T' denoting the total number of test cases. T testcases follow. In each test cases, it contains an integer 'N'.

Output:
For each testcase in a new line, print the factorial of N.

Constraints:
1 <= T <= 19
0 <= N <= 18

Example:
Input:
2
1
4

Output:
1
24




import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		long T=in.nextInt();
		while(T-->0)
		{
		    long n=in.nextInt();
		    long fact=1;
		    for(int i=1;i<=n;i++)
		    {
		         fact=fact*i;  
		          }
		       System.out.println(fact);
		}
	}
}

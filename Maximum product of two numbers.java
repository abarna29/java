Given an array with all elements greater than or equal to zero. Return the maximum product of two numbers possible.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N, size of array. The second line of each test case contains array elements.

Output:
Print the maximum product of two numbers possible.

Constraints:
1 ≤ T ≤ 100
2 ≤ N ≤ 107
0 ≤ A[i] ≤ 104

Example:
Input:
1
5
1 100 42 4 23

Output:
4200



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
       Scanner in=new Scanner(System.in);
       int T=in.nextInt();
       while(T-->0)
       {
           int n=in.nextInt();
           int a[]=new int[n];
           for(int i=0;i<n;i++)
           {
               a[i]=in.nextInt();
           }
           Arrays.sort(a);
          System.out.println(a[n-1]*a[n-2]);
           
       }
       
	}
}

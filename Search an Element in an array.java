Example:
Input:
2
4
1 2 3 4
4
2 4 7 8
1

Output:
2
-1

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
	    for(int i=0;i<T;i++)
		{
		    int n=in.nextInt();
		    int a[]=new int[n];
		    for(int j=0;j<n;j++)
		    a[j]=in.nextInt();
		    int x=in.nextInt();
		    int j=0;
		    for(j=0;j<n;j++)
		    {
		        if(a[j]==x)
		        {
		            System.out.println(j);
		            break;
		        }
		    }
		    if(j==n)
		    System.out.println("-1");
		}
	}
}

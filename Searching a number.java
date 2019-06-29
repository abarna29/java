Example:
Input :
2 
5 16
9 7 2 16 4
7 98
1 22 57 47 34 18 66

Output : 
4
-1



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
		     int x=in.nextInt();
		    int a[]=new int[n];
		    for(int j=0;j<n;j++)
		    a[j]=in.nextInt();
		    int j=0;
		    for(j=0;j<n;j++)
		    {
		        if(a[j]==x)
		        {
		            System.out.println(j+1+" ");
		            break;
		        }
		    }
		    if(j==n)
		    System.out.println("-1");
		}
	}
}

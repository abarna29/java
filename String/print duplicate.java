import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String c[]=s.split(" ");
		int co;
		for(int i=0;i<c.length;i++)
		{   
			co=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i].equals(c[j]))
				{
					co++;
					c[j]="0";
				}
			}
		
		if(co>1 && c[i]!="0")
			System.out.println(c[i]);
		}
    }  
} 
----------------------------------------
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String c[]=s.split(" ");
		int co;
		for(int i=0;i<c.length;i++)
		{   
			co=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i].equals(c[j]))
				{
					co++;
				}
			}
		
		if(co>1 )
			System.out.println(c[i]);
		}
    }  
} 


INPUT:
cat is a cat is also a cat

OUTPUT:
cat
is
a

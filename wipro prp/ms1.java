package aba;
class Example
{
	public static void main(String[] args)
	{
		String s="today is a nice day";
		String l[]=s.split(" ");
		int temp=41;
		int t2=temp%10;
		int t1=temp/10;
		String n1,n2,n3,n4;
		String te="";
		String te1="";
		String s1=l[t1-1];
		String s2=l[t2-1];
		if(s1.length()%2==0)
		{
			int mid=s1.length()/2;
			 n1=s1.substring(0,mid);
		     n2=s1.substring(mid);
		}
		else
		{
			int mid=s1.length()/2;
			n1=s1.substring(0,mid+1);
			n2=s1.substring(mid);
		}
		StringBuffer sb=new StringBuffer(n1);
		te += sb.reverse().toString()+n2;
		
		
		if(s2.length()%2==0)
		{
			int mid1=s2.length()/2;
			n3=s2.substring(0,mid1);
			n4=s2.substring(mid1);
		}
		else
		{
			int mid1=s2.length()/2;
			n3=s2.substring(0,mid1+1);
			n4=s2.substring(mid1);
		}
		StringBuffer sb1=new StringBuffer(n3);
		te1 += sb1.reverse().toString()+n4;
		
		System.out.println(te+" "+te1);
		
	}
}
OUTPUT:
ince dotday

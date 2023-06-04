import java.util.*;
import java.lang.*;
import java.io.*;
class Coursereg
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int k=sc.nextInt();
		    int y=m-k;
		    if(y>=n)
		        System.out.println("yes");
		    else
		        System.out.println("no");
		}
	}
}

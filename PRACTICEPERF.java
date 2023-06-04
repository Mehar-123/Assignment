import java.util.*;
import java.lang.*;
import java.io.*;
class Practice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		int s=0;
		for(int i=0;i<4;i++)
		{
		    a[i]=sc.nextInt();
		    if(a[i]>=10)
		    {
		        s++;
		    }
		}
		System.out.println(s);
	}
}

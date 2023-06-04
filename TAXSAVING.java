import java.util.*;
import java.lang.*;
import java.io.*;
class Taxsaving
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int min=x-y;
		    if(x>y)
		    {
		        System.out.println(min);
		    }
		}
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;
class Gdturn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++)
		{   
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    int sum=X+Y;
		    if(sum>6)
		        System.out.println("yes");
		    else
		        System.out.println("no");
		}
	}
}

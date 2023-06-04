import java.util.*;
import java.lang.*;
import java.io.*;
class Mincoins
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int res1=x%10;
		    int res2=res1%5;
		    if(res1==0){
		        System.out.println(x/10);
		    }
		    else if(res2==0){
		        int sum=x/10+res1/5;
		        System.out.println(sum);
		    }
		    else
		        System.out.println("-1");
		}
	}
}

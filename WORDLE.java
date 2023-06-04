import java.util.*;
import java.lang.*;
import java.io.*;
class Wordle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int a=1;a<=t;a++){
		    char [] S=sc.next().toCharArray();
		    char [] T=sc.next().toCharArray();
		    for(int i=0;i<5;i++){
		        if(S[i]==T[i]){
		            System.out.print("G");
		        }
		        else{
		            System.out.print("B");
		        
		        }
		    }
		    System.out.println();
		   }
		}
}

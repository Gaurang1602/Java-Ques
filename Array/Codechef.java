/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc=sc.nextInt();
		for(int i=0;i<tc;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    for(int j=2;j<100;j++){
		        if(a%j!=0 && b%j!=0 && c%j!=0 ){
		            System.out.println(j);
                    break;
		        }
		    }
		    
		}
	}
}

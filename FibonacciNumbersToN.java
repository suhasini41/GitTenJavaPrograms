package gitJavaPrograms;

import java.util.ArrayList;

public class FibonacciNumbersToN 
{
	public static void main(String args[])
	{
	    int n = 10;
	    ArrayList<Integer> al = new ArrayList<>();
	    int x=0,y=1;
	    al.add(x);
	    al.add(y);
	    int i = 2;
	    while(i<n)
	    {
	        int temp = x+y;
	        al.add(temp);
	        x = al.get(i-1);
	        y = al.get(i);
	        i++;
	        
	    }
	    System.out.println(al);
	}

}

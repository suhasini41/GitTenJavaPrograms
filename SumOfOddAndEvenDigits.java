package gitJavaPrograms;

public class SumOfOddAndEvenDigits
{
	public static void main(String args[])
	{
	    int n = 923450;
	    int even=0,odd=0;
	    String ns = Integer.toString(n);
	    int i = 0;
	    while(i<ns.length())
	    {
	        odd = odd + Integer.parseInt(String.valueOf(ns.charAt(i)));
	        if(i<ns.length()-1)
	        {
	            i++;
	            even= even + Integer.parseInt(String.valueOf(ns.charAt(i)));
	        }
	        i++;
	    }
	    if(odd>even)
	    {
	        System.out.println("Odd digits are greater than even digits");
	    }
	    else
	        System.out.println("Even digits are greater than odd digits");
	}

}

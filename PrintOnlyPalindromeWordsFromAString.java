package gitJavaPrograms;

public class PrintOnlyPalindromeWordsFromAString
{
	public static void main(String args[])
	{
	    String s = "madam is driving a racecar";
	    String[] sarr = s.split(" ");
	    for(int i=0;i<sarr.length;i++)
	    {
	        StringBuilder sb = new StringBuilder(sarr[i]);
	        sb.reverse();
	        if(sarr[i].equals(sb.toString()))
	        {
	           System.out.println(sarr[i]); 
	        }
	    }
	}

}

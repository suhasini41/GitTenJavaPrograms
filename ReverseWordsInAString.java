package gitJavaPrograms;

public class ReverseWordsInAString 
{
	public static void main(String args[])
	{
	    String str = "Suhasini is confident";
	    String[] sarr = str.split(" ");
	    
	    String str1 ="";
	    for(int i=0;i<sarr.length;i++)
	    {
	    	String revStr = "";
	        for(int j=sarr[i].length()-1;j>=0;j--)
	        {
	            revStr = revStr +sarr[i].charAt(j);
	            
	        }
	        str1 = str1 + revStr+" ";
	    }
	    System.out.println(str1);
	
	}
}

package gitJavaPrograms;

public class PalindromeNumbers 
{
	public static void main(String args[])
	{
	    int n = 12219;
	    int n1 = n;
	    int reverse=0;
	    while(n>10)
	    {
	        reverse = (reverse + (n%10))*10;
	        n = n/10;
	    }
	    reverse = reverse + n;
	    System.out.println(reverse);
	    if(reverse==n1)
	    {
	        System.out.println("The number is palindrome");
	    }
	    else
	        System.out.println("The number is not palindrome"); 
	}

}

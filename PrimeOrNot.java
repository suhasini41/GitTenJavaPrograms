package gitJavaPrograms;

public class PrimeOrNot
{
	
	public static void main(String args[])
	{
	    int n = 0;
	    boolean flag = false;
	    if(n<=0)
	    {
	    	System.out.println("Invalid number");
	    	return;
	    }
	    else if((n>3)&&(n>0))
	    {
	        for(int i=2;i<=(n/2);i++)
	        {
	            if(n%i==0)
	            {
	                flag = true;
	                break;
	            }
	        }
	    }
	    if(flag==true)
        {
            System.out.println("The number is not prime");
        }
        else
            System.out.println("The number is prime");
	}
}

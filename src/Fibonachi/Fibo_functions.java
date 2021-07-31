package Fibonachi;

// Fibonacci functions project - Gili Faibish
public class Fibo_functions {
	
	// Recursive function
	static public int fibRec(int k)
	{
	    if (k <= 1)
	        return k;
	    return fibRec(k-1) + fibRec(k-2);
	}
	
	// Loop function
	static public int fibLoop(int k) {

	    // Declare array to store Fibonacci numbers
	    int f[] = new int[k+2]; 
	    int i;
	      
	    // 0 and 1 definitions
	    f[0] = 0;
	    f[1] = 1;
	     
	    // for loop
	    for (i = 2; i <= k; i++)
	    {
	       // Add & store the previous 2 numbers
	        f[i] = f[i-1] + f[i-2];
	    }
	    
	    // Return statement
	    return f[k];
	}
	
	// Test
    public static void main (String args[])
    {
    	
    	// Test integer
    	int k = 8;
    	System.out.println("Original number : " + k);
    	
    	// Start time for loop
    	long s = System.nanoTime();
    	
    	// Perform loop function
	    System.out.println("Loop result : " + fibLoop(k));
	    long e = System.nanoTime();
	    
	    // Prints the time
	    System.out.println("Time : " + (e-s));
	    
	    // Saves the time in a long (for comparison)
	    long lr = (e-s);
	    
	    // Start time for recursive
	    s = System.nanoTime();
	    
	    // Perform recursive function
	    System.out.println("Recursive result : " + fibRec(k));
	    e = System.nanoTime();
	    
	    // Prints the time
	    System.out.println("Time : " + (e-s));
	    
	    // Saves the time in a long (for comparison)
	    long rr = (e-s);
	    
	    // Prints which function was more efficient
	    if (rr<lr) {
	    	System.out.println("Recursive is more efficient");
	    }
	    else if (rr>lr) {
	    	System.out.println("Loop is more efficient");
	    }
	    else {
	    	System.out.println("Both are equally efficient");
	    }
    }
}
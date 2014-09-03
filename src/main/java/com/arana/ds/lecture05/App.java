package com.arana.ds.lecture05;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	printPrimes(34);
    }
    
	public static int[][] pascalTriangle(int n){
		int[][] pt = new int[n][];
		for(int i = 0; i < n; i++){
			// Construct row i
			pt[i] = new int[i+1];
			// Leftmost value of row i
			pt[i][0] = 1;
			// Sum 2 entries above
			for(int j = 1; j < i; j++){
				pt[i][j] = pt[i - 1][j - 1] + pt[i - 1][j];
			}
			pt[i][i] = 1;
		}
		return pt;
	}
    
 // For loop
    public static boolean isPrime(int n){
    	for(int divisor = 2; divisor < n; divisor++){
    		if(n % divisor == 0){
    			return false;
    		}
    	}
    	return true;
    }
    
    public static void printPrimes(int n){
    	boolean[] prime = new boolean[n + 1];
    	int i;
    	// Initialize the whole array to true
    	for(i = 2; i <= n; i++){
    		prime[i] = true;
    	}
    	// all divisor that are less or equal to the 
    	// square root of n
    	for(int divisor = 2; divisor * divisor <= n; divisor++){
    		if(prime[divisor]){
    			for(i = 2*divisor; i<= n; i = i + divisor){
    				prime[i] = false;
    			}
    		}
    	}

    	for(i = 2; i <= n; i++){
    		if(prime[i]){
    			System.out.println(" " + i);
    		}
    	}
    }
    
}

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
    
    // while loop
    public static boolean isPrime(int n){
    	int divisor = 2;
    	while(divisor < n){
    		// if n is divisible by divisor
    		if(n % divisor == 0){
    			return false;
    		}
    		divisor++;
    	}
    	return true;
    }
    
 // Print all primes in range 2..n
    public static void printPrimes(int n){
    	int i;
    	for(i = 2; i <= n; i++){
    		if(isPrime(i)){
    			System.out.println(" " + i);
    		}
    	}
    }
    
}

package com.paulkim.csc229.Week8;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
        
        //Time complexity
        //1 + n + n + 1 + 3√n + 1 = O(√n * n)
        //Ω(1)
        
        //Space
        //1 + 1 = O(1)
        long sum = 0; //+1
        for(int j = 0; j < n; j++) //n + n + 1
        {
            for(int i = 2; i <= n/i; i++) // √n
            {
                if(n % i == 0) //√n
                    sum += n; //√n
            }
        }
        return sum; //+1
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10;

/**
 *
 * @author paulk
 */
public class Week10Problem01 {
    public static void main(String[] args) {
        System.out.println(sumOfPrimeThree(23));
    }
    
    /**
     * Sums up all prime numbers with the number 3 and returns it
     * 
     * @param n Number to read through
     * @return The sum of prime numbers with the number 3
     */
    static int sumOfPrimeThree(int n)
    {
        int sum = 0;
        if(n < 2)
            return sum;
        for(int i = 2; i <= n; i++)
        {
            if(contains3(i) && isPrime(i)) //log(base(10)n + √n
                sum += i;
        }
        
        return sum;
        
        //I believe the time complexity for this algorithm is
        //O(n(log(base(10)n + √n)) 
    }
    
    /**
     * Uses modulus and divide operate to figure out if a number contains the number 3
     * 
     * @param n Number to be checked
     * @return Whether a number contains 3
     */
    static boolean contains3(int n)
    {
        while(n != 0)
        {
            if(n % 10 == 3) return true;
            else n /= 10;
        }
        return false;
        
        //O(log(base(10)n))
    }
    
    /**
     * Checks if a number is prime
     * 
     * @param n Number to be checked if prime
     * @return Whether a number is prime
     */
    static boolean isPrime(int n)
    {
        //1 is always not a prime number so take this out right away
        if(n == 1)
            return false;
        
        /*
            Since all factors of a number, exclusive of the number itself, will be less than or equal to half the number
            Telling the program to calculate if n divided by the number you are checking is less than or equal to half of n,
            Makes sure that the √n is the most that part can run since dividing n by any number greater than the square root of n
            will be > n/i, i being the number you are checking.
        */
        for(int i = 2;i <= n/i; i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
        
        //O(√n) 
    }
}

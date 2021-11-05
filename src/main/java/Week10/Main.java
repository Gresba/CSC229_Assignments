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
public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfPrimeThree(23));
    }
    
    static int sumOfPrimeThree(int n)
    {
        int sum = 0;
        if(n < 2)
            return sum;
        for(int i = 2; i <= n; i++)
        {
            if(contains3(i) && isPrime(i))
                sum += i;
        }
        
        return sum;
    }
    
    static boolean contains3(int n)
    {
        while(n != 0)
        {
            if(n % 10 == 3) return true;
            else n /= 10;
        }
        return false;
    }
    
    static boolean isPrime(int n)
    {
        if(n < 2)
            return false;
        for(int i = 2;i <= n/i; i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}

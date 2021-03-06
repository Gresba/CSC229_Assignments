/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week9;

/**
 *
 * @author paulk
 */
public class Homework09 {
    // ToDo 01:  Write an algorithm to solve the following problem
    /*
    The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
    1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
    Let us list the factors of the first seven triangle numbers:
     1: 1
     3: 1,3
     6: 1,2,3,6
    10: 1,2,5,10
    15: 1,3,5,15
    21: 1,3,7,21
    28: 1,2,4,7,14,28
    We can see that 28 is the first triangle number to have over five divisors.
    What is the value of the first triangle number to have over one hundred divisors?
        //ANSWER: 73920
    */
    public static void main(String[] args) {
        System.out.println(triangleHundred(100));
    }
    
    static int triangleHundred(int factors)
    {
        int dCounter = 0;
        int i = 1;
        int sum = 0;
        
        while(dCounter <= factors)
        {
            dCounter = 0;
            sum += i++;
            for(int j = 1; j < sum;j++)
            {
                if(sum % j == 0)
                {
                    dCounter++;
                }
            }
        }
        return sum;
    }
}

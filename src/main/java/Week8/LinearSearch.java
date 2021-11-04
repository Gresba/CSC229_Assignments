/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week8;

/**
 *
 * @author paulk
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code 
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == x)
                return i;
        }
        
        return -1;
         //         - prvoide asymptotic analysis of the developed solution
         //+ 1 + 1 + n + n + n -> 2 + 3n -> O(n)
         // Ω(1)
    }
}

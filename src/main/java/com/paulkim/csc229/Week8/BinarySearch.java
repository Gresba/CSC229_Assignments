package com.paulkim.csc229.Week8;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE; //+1

        while (low <= high) { //log(n)
            int mid = low + ((high - low) / 2); //+log(n)
            if (sortedArray[mid] < key) { // log(n)
                low = mid + 1; // +1
            } else if (sortedArray[mid] > key) { 
                high = mid - 1; 
            } else if (sortedArray[mid] == key) { 
                index = mid;
                break;
            }
        }
        return index; // + 1
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    
    //Best Case: Ω(1)
    //Worst Case: O(log(n))
    
    //Space = O(n) n = length of sortedArray
}
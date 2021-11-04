package com.paulkim.csc229.Week8;

import java.util.Arrays;

/**
 *
 * @author paulk
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if(a[outer] < a[inner])
                {
                    temp = a[inner];
                    a[inner] = a[outer];
                    a[outer] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        
        //Worst Case: O(n^2)
        //Best Case: Ω(n)
    }
}

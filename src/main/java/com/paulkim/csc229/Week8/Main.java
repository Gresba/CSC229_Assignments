/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paulkim.csc229.Week8;

/**
 *
 * @author paulk
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 11, 4, 2, 6};
        int[] sortArr = {1, 5, 7, 8, 9, 11, 15, 21};
        System.out.println("Bubble Sorted Array Result: ");
        BubbleSort.bubbleSort(arr, 7);
        System.out.println("Binary Search Index: " + BinarySearch.runBinarySearchIteratively(sortArr, 9, 0, 8));
        System.out.println("Linear Search Index: " + LinearSearch.search(arr, 4));
        System.out.println("Sum of Primes: " + Problem01.getSumOfPrimes(13));
    }
}

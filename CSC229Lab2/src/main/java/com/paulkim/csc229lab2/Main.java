package com.paulkim.csc229lab2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(System.in);
        Scanner scanner;
        
        int sumOrProduct = 0;
        int arrSize = 0;
        int[] inputArray;
        
        String inputFile = "";
        
        while(sumOrProduct != 3)
        {
            System.out.println("Find Sum or Greatest Product? ");
            System.out.println("[1] Sum");
            System.out.println("[2] Greatest Product");
            System.out.println("[3] Exit Program");
            System.out.println("Go to Files View (Top Left, next to Projects) -> Sum.txt is for [1] and GreatestProduct.txt is for [2]");
            System.out.println("Choice: ");
            sumOrProduct = input.nextInt(); 
            
            switch(sumOrProduct)
            {
                case 1:
                    scanner = new Scanner(new FileReader("Sum.txt"));
                    int numberOne = scanner.nextInt();
                    int numberTwo = scanner.nextInt();
                    System.out.println(sum(numberOne, numberTwo));
                    break;
                case 2:
                    scanner = new Scanner(new FileReader("GreatestProduct.txt"));
                    
                    arrSize = scanner.nextInt();
                    inputArray = new int[arrSize];
                        
                    for(int i = 0; i < arrSize; i++)
                    {
                        int number = scanner.nextInt();
                        inputArray[i] = number;
                    }
                    
                    System.out.println("Greatest Product: " + greatestProduct(arrSize, inputArray));
                    break;
                case 3:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Not a valid input!");
                    break;
            }
        }
    }
    
    public static int sum(int numberOne, int numberTwo)
    {
        return numberOne + numberTwo;
    }
    
    public static int greatestProduct(int arrSize, int[] array)
    {
        int highest = 0; // +1
        int secondHighest = 0; // +1
        
        for(int i = 0; i < arrSize;i++) // +n
        {
            if(0 == i) // +n
            {
                highest = array[i]; // +n
            }else if(1 == i){
                secondHighest = array[i];
            }
            
            if(array[i] > highest){ // +n
                highest = array[i]; // +n
            }else if(array[i] > secondHighest){
                secondHighest = array[i];
            }
        }
        
        return highest * secondHighest; // +1
    }
}
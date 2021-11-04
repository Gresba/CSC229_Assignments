package Week2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.*;
import java.util.Scanner;

/**
 * The main class for the project. This is where the main method will be where
 * all the code will run.
 *
 * @author Paul Kim
 * @version 1.0
 * @since 9/18/2021
 *
 */
public class Lab02 {

    /**
     * The main method runs all the code
     *
     * @param args
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Scanner scanner;

        int sumOrProduct = 0;
        int arrSize = 0;
        int[] inputArray;

        //Options
        System.out.println("Find Sum or Greatest Product? ");
        System.out.println("[1] Sum");
        System.out.println("[2] Greatest Product");
        System.out.println("Go to Files View (Top Left, next to Projects) -> Sum.txt is for [1] and GreatestProduct.txt is for [2]");
        System.out.println("Choice: ");
        sumOrProduct = input.nextInt();

        Instant start = null;
        Instant finish = null;
        long timeElapsed;

        switch (sumOrProduct) {
            case 1:

                //Gets sum file and gets the first and second number
                scanner = new Scanner(new FileReader("Lab2_Sum"));
                int numberOne = scanner.nextInt();
                int numberTwo = scanner.nextInt();

                //Timing how long it takes to run sum()
                start = Instant.now();

                System.out.println("Sum: " + sum(numberOne, numberTwo));
                break;
            case 2:

                //Gets GreatestProduct file and populates the necessary data                  
                scanner = new Scanner(new FileReader("Lab2_GreatestProduct"));

                arrSize = scanner.nextInt();
                inputArray = new int[arrSize];

                for (int i = 0; i < arrSize; i++) {
                    int number = scanner.nextInt();
                    inputArray[i] = number;
                }

                //Timing how long it takes to run greatestProduct()
                start = Instant.now();

                System.out.println("Greatest Product: " + greatestProduct(arrSize, inputArray));
                break;

            //Exit program option
            case 3:
                System.out.println("Exiting Program...");
                break;
            default:
                System.out.println("Not a valid input!");
                break;
        }
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis(); //in millis
        System.out.println("Time to calculate sum: " + timeElapsed + " milliseconds");
    }

    /**
     * Calculates sum of two numbers
     *
     * @param numberOne
     * @param numberTwo
     * @return numberOne + numberTwo
     */
    public static int sum(int numberOne, int numberTwo) {

        //Adds and returns
        return numberOne + numberTwo;
    }

    /**
     * Finds the greatest possible product from a given input
     *
     * @param arrSize
     * @param array
     * @return greatestProduct
     */
    public static int greatestProduct(int arrSize, int[] array) {
        int highest = array[0]; // +1
        int secondHighest = array[1]; // +1

        for (int i = 2; i < arrSize; i++) // +n
        {
            //Checking if there are no other higher numbers + 2n
            if (array[i] > highest) {
                highest = array[i];
            } else if (array[i] > secondHighest) {
                secondHighest = array[i];
            }
        }

        return highest * secondHighest; // +1
    }
}

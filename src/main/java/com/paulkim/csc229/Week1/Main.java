package com.paulkim.csc229.Week1;

/**
 * Main class which runs all the code and contains the main method
 *
 * @author Paul Kim
 * @version 1.0
 * @since 9/12/2021
 *
*/
public class Main {
    
    /**
     * Runs the code
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        //Initializing two different courses with two different constructors
        Course course1 = new Course();
        Course course2 = new Course(97776, "Data Structures and Algorithms I", "CSC 229");
        
        //Printing out members of course 1 without populating any data
        System.out.println("----------- Course 1 | Before populating members -----------");
        System.out.println("Course 1:");
        System.out.println("Id: " + course1.getiD());
        System.out.println("Name: " + course1.getName());
        System.out.println("Code: " + course1.getCode());
        
        //Setting the data in course 1 using setters
        course1.setiD(12321);
        course1.setName("Test Course!");
        course1.setCode("TCS 323");
        
        //Printing out members of course 1 after populating using getters
        System.out.println("----------- Course 1 | After populating members -----------");
        System.out.println("Course 1:");
        System.out.println("Id: " + course1.getiD());
        System.out.println("Name: " + course1.getName());
        System.out.println("Code: " + course1.getCode());
        
        //Printing out members of course 2 after populating using getters
        System.out.println("----------- Course 2 | After populating members -----------");
        System.out.println("Course 2:");
        System.out.println("Id: " + course2.getiD());
        System.out.println("Name: " + course2.getName());
        System.out.println("Code: " + course2.getCode());
        System.out.println("-----------------------------------------------------------");
    }
}
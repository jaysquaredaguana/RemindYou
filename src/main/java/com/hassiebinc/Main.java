package com.hassiebinc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Remind You app");
        System.out.println("");
        System.out.println("Don't forget to track your distance with the fitness app");
        System.out.println("Also remember to drink water");

        String appname = "RemindYou"; // Text
        int number = 30;  // Whole number
        double weight = 80.5; // Decimal number
        boolean happy = true; // true or false
        float salary = 2394.9592f; // Comma number with more decimal (f)
        char firstLetter = 'R'; // 1 letter command

        // Store information
        String yourName = "JJ"; // Your name
        int age = 28; // Your age
        double yourWeight = 67.9; // Your weight
        float dreamSalary = 6767.6767f; // Dream Salary per month
        char firstLetterOfYourLastName = 'A'; // firstLetterOfYourLastname
        boolean lovesGaming = true; // lovesGaming (boolean)
        boolean knowsWhatIsGoingOn = false;

        System.out.println("=== About Me ===");
        System.out.println("Your Name: " + yourName);
        System.out.println("Age: " + age);
        System.out.println("Your Weight: " + yourWeight);
        System.out.println("Dream Salary: " + dreamSalary);
        System.out.println("First Letter of Your Last Name: " + firstLetterOfYourLastName);
        System.out.println("Loves Gaming?: " + lovesGaming);
        System.out.println("Locked in?: " + !knowsWhatIsGoingOn);
    }
}
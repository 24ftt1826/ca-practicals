package Practical7_Aziz_24ftt1826;

import java.util.Scanner;

public class Practical_7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalNumber = 0;     
        int number;              
        int positiveNumber = 0;   
        int negativeNumber = 0;   
        int numberCount = 0;     
        double average;           

        System.out.println("Enter an integer, the input ends if it is 0:");

        while (true) {
            number = input.nextInt();

            if (number == 0) {
                if (numberCount == 0) {
                    System.out.println("No number is entered except for 0 to end the program.");
                }
                break; 
            }

            if (number > 0) {
                positiveNumber++;
            } else {
                negativeNumber++;
            }

            totalNumber += number;  
            numberCount++;          
        }

        if (numberCount > 0) {
            average = (double) totalNumber / numberCount;
            System.out.println("The number of positive is " + positiveNumber);
            System.out.println("The number of negatives is " + negativeNumber);
            System.out.println("The total is " + totalNumber);
            System.out.printf("The average is %.2f\n", average);
        }


    }
}

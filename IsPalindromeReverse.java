package Practical10_Aziz_24ftt1826;

import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int randomNumber = (int)(Math.random() * 900) + 100;
        
        
        System.out.print("Enter the reverse of " + randomNumber + ": ");
        int userInput = input.nextInt();
        
        
        if (userInput < 100 || userInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + randomNumber + ": ");
            userInput = input.nextInt();
        }
        
        
        int reversedNumber = reverse(randomNumber);
        
        
        boolean isPalindrome = isPalindrome(randomNumber, userInput);
        
        
        System.out.println("The digit " + userInput + " is palindrome of " + randomNumber + " is " + isPalindrome + ".");
        
        input.close();
    }
    
    
    public static int reverse(int number) {
        int reversed = 0;
        
        while (number != 0) {
            int digit = number % 10;  
            reversed = reversed * 10 + digit;  
            number = number / 10;  
        }
        
        return reversed;
    }
    
   
    public static boolean isPalindrome(int number, int userInput) {
        int reversedNumber = reverse(number);
        return userInput == reversedNumber;
    }
}
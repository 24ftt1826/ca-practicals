package Practical7_Aziz_24ftt1826;

import java.util.Scanner;

public class Practical_7_2 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numberofrounds = 0;
        int yourscore = 0;
        int computerscore = 0;
        int yourchoices = 0;
        int computerchoice = 0;

        String continuation;

        do {
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            yourchoices = input.nextInt();

            computerchoice = (int)(Math.random() * 100) % 3;

          
            if (computerchoice == 0) { System.out.print("The computer is rock. "); }
            if (computerchoice == 1) { System.out.print("The computer is paper. "); }
            if (computerchoice == 2) { System.out.print("The computer is scissor. "); }

            if (yourchoices == 0) { System.out.print("You are rock. "); }
            if (yourchoices == 1) { System.out.print("You are paper. "); }
            if (yourchoices == 2) { System.out.print("You are scissor. "); }

           
            if (yourchoices == computerchoice) {
                System.out.println("It is a draw.");
            }
            if (yourchoices == 0 && computerchoice == 1) {
                System.out.println("You lose.");
                computerscore++;
            }
            if (yourchoices == 0 && computerchoice == 2) {
                System.out.println("You win.");
                yourscore++;
            }
            if (yourchoices == 1 && computerchoice == 0) {
                System.out.println("You win.");
                yourscore++;
            }
            if (yourchoices == 1 && computerchoice == 2) {
                System.out.println("You lose.");
                computerscore++;
            }
            if (yourchoices == 2 && computerchoice == 0) {
                System.out.println("You lose.");
                computerscore++;
            }
            if (yourchoices == 2 && computerchoice == 1) {
                System.out.println("You win.");
                yourscore++;
            }

            numberofrounds++;

            System.out.print("Enter y to play again: ");
            continuation = input.next();

        } while (continuation.equalsIgnoreCase("y"));
        

        System.out.println("In the total of " + numberofrounds + " round(s), You scored " 
                           + yourscore + ", Computer scored " + computerscore);

        if (yourscore > computerscore) {
            System.out.println("You won the game.");
        } 
        else if (yourscore < computerscore) {
            System.out.println("You lose the game.");
        } 
        else {
            System.out.println("It is a draw game.");
        }

    }
}

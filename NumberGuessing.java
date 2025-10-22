import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = random.nextInt(numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }
        
        int chances = 10;
        boolean won = false;
        
        while (chances > 0 && !won) {
            System.out.println("Guess 4 numbers (no duplicates):");
            int[] guess = new int[4];
            
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }
            
            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) {
                    score++;
                }
            }
            
            chances--;
            
            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                won = true;
            } else if (chances == 0) {
                System.out.print("The actual number is ");
                for (int i = 0; i < 4; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println(". You lose.");
            } else {
                System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");
            }
        }
    }
}
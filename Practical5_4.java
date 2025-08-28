import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Practical5_4 {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);

        String Question = num1 + " % " + num2 + " = ?\r\n ";

        java.io.File folder = new java.io.File("practical 5");
        if (!folder.exists()) {
            folder.mkdir();
        }

        FileWriter writer = new FileWriter("practical 5/Modulus Questions.txt");
        writer.write(Question);
        writer.close();

        System.out.println("A new question added");

    }
}

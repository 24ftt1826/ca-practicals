import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Practical_5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String name = input.nextLine().toUpperCase();

        Random random = new Random();
        int queueNumber = random.nextInt(100) + 1;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String DateTime = LocalDateTime.now().format(formatter);

        java.io.File folder = new FileWriter("practical 5/QReceipt.txt");
        writer.write(DateTime + "\r\n");
        writer.write("Hi, " + name + "\r\n");
        writer.write("Your Queue No is: "+ queueNumber + "\r\n");
        writer.write();

        System.out.println("Receipt generated. Thank you");
    }
}

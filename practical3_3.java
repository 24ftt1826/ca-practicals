import java.util.Scanner;

public class practical3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a charachter: ");
        char Char = input.next().charAt(0);

        int Unicode = (int) Char;

        System.out.println("The Unicode for character "+Char+" is "+Unicode);
    }
}

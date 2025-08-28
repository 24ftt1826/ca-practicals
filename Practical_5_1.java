import java.util.Scanner;

public class Practical_5_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter word 1");
        String Word_1 = input.nextLine();

        System.out.println("enter word 2");
        String Word_2 = input.nextLine();

        boolean Same_word = Word_1.equalsIgnoreCase(Word_2);


        System.out.println("are both words the same?: "+Same_word);
    }
}
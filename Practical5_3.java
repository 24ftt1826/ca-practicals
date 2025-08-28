import java.util.Scanner;

public class Practical5_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your message");
        String Message_1 = input.nextLine();
        System.out.println("Enter a substring to replace");
        String Word_1 = input.nextLine();
        System.out.println("Enter a word you want to replace the substring word with");
        String Word_2 = input.nextLine();

        String Replaced_words = Message_1.replace(Word_1,Word_2);

        System.out.println("The updated message is "+Replaced_words);
    }
}

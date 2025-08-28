import java.util.Scanner;

public class Practical5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word with 5 letters, not more or less");
        String word = input.nextLine();

        if(word.length() <= 5) {

            System.out.println("The reverse of the word "+word+" is "+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));

        }else{
            System.out.println("Please enter ONLY 5 letter words!");

        }

        
    }
}

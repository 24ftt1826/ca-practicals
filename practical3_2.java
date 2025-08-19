import java.util.Scanner;

public class practical3_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of byte(s) to be converted: ");
        int byte1 = input.nextInt();

        System.out.println(byte1+"byte(s) is "+ byte1*byte1+"bits");
    
        System.out.println("Enter the number of byte(s) to be converted: ");
        int byte2 = input.nextInt();

        System.out.println(byte2+"byte(s) is "+ byte2*byte2+"bits");
    }
}
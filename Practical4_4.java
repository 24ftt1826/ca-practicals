import java.util.Scanner;

public class Practical4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to Convert Brunei Dollars to Ringgit Malaysia and 2 Vice Versa: ");
        int enter = input.nextInt();
        System.out.println("Enter Amount to be converted: ");
        double Amount = input.nextDouble();
        double BND_or_RM=enter<2? Amount*3:Amount/3;

        System.out.printf("The change is $%.2f",BND_or_RM );
    }
}

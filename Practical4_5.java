import java.util.Scanner;

public class Practical4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of the first Package: ");
        Double Amount1 = input.nextDouble();
        System.out.println("Enter the price of the first package in gram: ");
        int Weight1 = input.nextInt();

        System.out.println("");

        System.out.println("Enter the price of the Second Package: ");
        Double Amount2 = input.nextDouble();
        System.out.println("Enter the price of the Second package in gram: ");
        int Weight2 = input.nextInt();

        Double first_package = Weight1/Amount1;
        Double Second_package = Weight2/Amount2;
        System.out.println("");

        String Better_choice = first_package>Second_package?"First package is more worthed":"Second package is more worthed";
        System.out.println(Better_choice);
    }
}

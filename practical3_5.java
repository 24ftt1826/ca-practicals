import java.util.Scanner;

public class practical3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your target amount of money? ");
        Double targeted_amount = input.nextDouble();
        System.out.println("$"+targeted_amount);
        
        System.out.println("how many months(s) to reach your money goal? ");
        int targeted_months = input.nextInt();
        System.out.println("$"+targeted_months);

        int month = 30;
        int targeted_months_days = month*targeted_months;
        Double save_per_day = targeted_amount/targeted_months_days;

        System.out.printf("the amount you need to save per day is $%.2f",save_per_day);

    }
}

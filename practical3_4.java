import java.util.Scanner;

public class practical3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Double durian = 15.75;
        System.out.println("Each durian cost $"+ durian);

        System.out.println("How Much is your current money? ");
        Double User_Money = input.nextDouble();
        
        Double durian_totalcost=User_Money/durian;
        int durian_totalcost_int=(int)+durian_totalcost;

        System.out.println("The number of durian(s) you can buy is "+durian_totalcost_int);







    }
}
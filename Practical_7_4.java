package Practical7_Aziz_24ftt1826;
import java.util.Scanner;
public class Practical_7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int term0=0;
        int term1=1;

        System.out.println("Please enter the term : ");
        int terminput = input.nextInt();

        for(int i=terminput;i>0;i--){

            int temp= term1+term0;
            term0=term1;
            term1=temp;
            
        }
        System.out.println("At term "+terminput+" the number is "+term0);
    }
}

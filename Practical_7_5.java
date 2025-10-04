package Practical7_Aziz_24ftt1826;
import java.util.Scanner;
public class Practical_7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = 0 ;
        int count = 0 ;
        int num = 0;

        System.out.println("Enter numbers, the input ends with 0 entered:");

        while(true){
            num = input.nextInt();

            if(num==0){

                break;
            }
          
            if (num==largest){
                count++;
            }
            if(num>largest){
                largest=num;
                count=1;
            }
        }
        System.out.println("The largest number is "+largest);
        System.out.println("The occurrence count of the largest number is "+count);


    }
}

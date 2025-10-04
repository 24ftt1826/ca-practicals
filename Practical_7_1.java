package Practical7_Aziz_24ftt1826;

public class Practical_7_1 {
    public static void main(String[] args) {

    int num_1 = 1;

    System.out.println("Below is Generated using while loop:");

    while (num_1<=20) {
        
        System.out.print(num_1);
        num_1++;

    }

    System.out.println();
    System.out.println();
    int num_2 = 51;

    System.out.println("Below is Generated using while loop:");

    do {

    num_2--;
    System.out.print(num_2);
    

    } while (num_2!=35);

    System.out.println();
    System.out.println();
    System.out.println("below is generated using for loop: ");


    char index = 0;
    
    for (index = 0; index <= 25; index++) {
        
    String word = "abcdefghijklmnopqrstuvwxyz";
    char alphabet = word.charAt(index);
    System.out.print(alphabet);

    }
    }
}

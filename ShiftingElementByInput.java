import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many numbers are there?");
        int count = input.nextInt();
        
        int[] numbers = new int[count];
        
        System.out.println("Enter the " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = input.nextInt();
        }
        
        System.out.println("Enter number of left shift:");
        int shift = input.nextInt();
        
        
        for (int s = 0; s < shift; s++) {
            int first = numbers[0];
            for (int i = 0; i < count - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[count - 1] = first;
        }
        
        System.out.println("The shifted arrangement is:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i]);
        }
    }
}
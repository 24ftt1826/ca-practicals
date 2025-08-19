import java.util.Scanner;

public class Practical4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter 3 coordinates for a traingle ");

        Double x1 = input.nextDouble();
        Double y1 = input.nextDouble();
        Double x2 = input.nextDouble();
        Double y2 = input.nextDouble();
        Double x3 = input.nextDouble();
        Double y3 = input.nextDouble();

        Double Side1 = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        Double Side2 = Math.sqrt(Math.pow((x3-x2), 2)+Math.pow((y3-y2), 2));
        Double Side3 = Math.sqrt(Math.pow((x3-x1), 2)+Math.pow((y3-y1), 2));

        Double S = (Side1+Side2+Side3)/2;

        Double AreaOfTriangle = Math.sqrt(S*(S-Side1)*(S-Side2)*(S-Side3));

        System.out.printf("The area of the triangle is %.1f%n ", AreaOfTriangle);
    }
}

public class practical3_1 {

    public static void main(String[] args) {

        double base = 4.0;
        double height = 6.0;
        double radius = 8.0;
        final double pi = 3.14;

        double Areaofsquare = base*base;
        double Areaoftriangle = 0.5*base*height;
        double Areaofcircle = pi*radius*radius;
        
        System.out.printf("The area of Square is "+Areaofsquare+"\n"+"The area of triangle is "+Areaoftriangle+"\n"+"The area of circle is "+Areaofcircle);


    }
}
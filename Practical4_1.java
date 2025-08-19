import java.util.Scanner;

public class Practical4_1 {
    
    public static void main(String[] args) {

        Scanner input = new
        Scanner(System.in);

        
       boolean isSumTrue;
    
        int start = 1, end = 100;
      
        int random1 = (int) (Math.random()*100)+start;
        int random2 = (int) (Math.random()*100)+start;
        

        System.out.println("What is "+ (int)random1+" + "+ (int)random2+" ?");
        int Sum = input.nextInt();
        int IsSumtrue = Sum;
        
        boolean YES = (Sum == (random1 + random2));
        
        
        System.out.println(+random1+" + "+random2+" = "+Sum+" is "+YES);

        System.out.println("What is "+ (int)random1+" % "+ (int)random2+" ?");
        int Modulus11 = input.nextInt();

        boolean IsModulus11True = (Modulus11 == (random1 % random2));

        System.out.println(+random1+ " % "+random2+" = "+Modulus11+" is "+IsModulus11True);

        
        
    }
}   
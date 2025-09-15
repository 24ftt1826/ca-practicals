import java.util.Scanner;

public class Practical_6_1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter rock (0), paper (1), scissor (2)");
        int userinput = input.nextInt();

        int bot = (int)(Math.random()*100)%3; 

        if (bot==0) { System.out.print("The computer is rock. ");}
        if (bot==1) { System.out.print("The computer is paper. ");}
        if (bot==2) { System.out.print("The computer is scissor. ");}

        if (userinput==0) { System.out.print("you are rock. ");}
        if (userinput==1) { System.out.print("you are paper. ");}
        if (userinput==2) { System.out.print("you are Scissor. ");}

        if (userinput==bot) { System.out.print("It is a draw");}
        if (userinput==0 && bot==1) { System.out.print("you lose");}
        if (userinput==0 && bot==2) { System.out.print("you win");}
        if (userinput==1 && bot==0) { System.out.print("you win");}
        if (userinput==1 && bot==2) { System.out.print("you lose");}
        if (userinput==2 && bot==0) { System.out.print("you lose");}
        if (userinput==2 && bot==1) { System.out.print("you win");}
        
    }
}

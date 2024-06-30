import java.util.Random;
import java.util.Scanner;

public class game {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 0 Rock , 1 for paper , 2 Scissors");
       int UserInput = sc.nextInt();

       Random rand = new Random();
       int ComputerInput = rand.nextInt(3);

       if (UserInput==ComputerInput){
           System.out.println("Draw !!");
       } else if (UserInput== 0 && ComputerInput == 2 || UserInput== 1 && ComputerInput==0
               || UserInput==2 && ComputerInput ==1 ){
           System.out.println("You win ..");
       }
       else {
           System.out.println("computer win !");
       }
//        System.out.println("Computer choice : " + ComputerInput);

       if (ComputerInput==0){
           System.out.println("Computer choice : Rock");
       } else if (ComputerInput==1) {
           System.out.println("Computer choice : paper");
       } else if (ComputerInput==2) {
           System.out.println("Computer choice : Scissors");
       }
   }
}


////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int MyNumber = (int) (Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userNumber = 0;
        do {
            System.out.println("Guess the Number (1-100) : ");
            userNumber = sc.nextInt();

            if (userNumber==MyNumber){
                System.out.println("WOOHOO is correct ...");

            } else if (userNumber>MyNumber) {
                System.out.println("Too large ...");
            }
            else {
                System.out.println("Too small ...");
            }
        }while (userNumber>0);

        System.out.println("My Number was : ");
        System.out.println(MyNumber);
    }
    }

















//import java.util.Scanner;
//
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        //MINI PROJECT
//
//        Scanner sc = new Scanner(System.in);
//
//        int myNumber = (int)(Math.random()*100);
//
//        int userNumber = 0;
//
//
//        do {
//
//            System.out.println("Guess my number(1-100) : ");
//
//            userNumber = sc.nextInt();
//
//
//            if(userNumber == myNumber) {
//
//                System.out.println("WOOHOO .. CORRECT NUMBER!!!");
//
//                break;
//
//            }
//
//            else if(userNumber > myNumber) {
//
//                System.out.println("your number is too large");
//
//            }
//
//            else {
//
//                System.out.println("your number is too small");
//
//            }
//
//        } while(userNumber >= 0);
//
//
//        System.out.print("My number was : ");
//
//        System.out.println(myNumber);
//
//    }
//
//}
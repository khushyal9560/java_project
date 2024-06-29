import java.util.Scanner;
public class currency_converter{
    private static double usdToEurRate = 0.85;
    private static double RuppeeToUsdRate = 83.96;
    private static double rubleTopoundRate = 0.0092;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Currency Converter!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Convert USD to EUR");
            System.out.println("2. Convert Rupee to USD");
            System.out.println("3. Convert Ruble to Pound");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertUSDToEUR();
                    break;
                case 2:
                    convertRupeeToUSD();
                    break;
                case 3:
                    convertRUBLEToPOUND();
                    break;
                case 4:
                    System.out.println("Thank you for using the Currency Converter!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void convertUSDToEUR() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in USD: ");
        double usdAmount = scanner.nextDouble();
        double eurAmount = usdAmount * usdToEurRate;
        System.out.println(usdAmount + " USD is equivalent to " + eurAmount + " EUR");
    }

    private static void convertRupeeToUSD() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in Rupee: ");
        double RupeeAmount = scanner.nextDouble();
        double usdAmount = RupeeAmount * RuppeeToUsdRate;
        System.out.println(RupeeAmount + " Rupee is equivalent to " + usdAmount + " USD");
    }
    private static void convertRUBLEToPOUND() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in Rubble: ");
        double RubbleAmount = scanner.nextDouble();
        double poundAmount = RubbleAmount * rubleTopoundRate;
        System.out.println(RubbleAmount + " RUBLE is equivalent to " + poundAmount +  " POUND");
    }
}




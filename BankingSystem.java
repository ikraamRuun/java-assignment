import java.util.Scanner;

public class BankingSystem {
   static double balance = 0; // Balance variable


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Banking System Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("please Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please Try again.");
            }

        } while (choice != 4);
    }

    public static void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public static void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = input.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");

        }  else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }


    public static void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

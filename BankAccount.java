import java.util.Scanner;

class BankAccountDetail {
    int Deposit;
    int Withdraw;
    int BalanceCheck;
}

public class BankAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccountDetail b = new BankAccountDetail();

        System.out.println("Welcome to National Bank");
        System.out.println("Current your amount is 5000");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance Check");
        System.out.print("What you want: ");

        int cash = 5000;
        int dep = 0;
        int with = 0;

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                dep = sc.nextInt();
                cash = cash + dep;
                System.out.println("After deposit balance: " + cash);
                break;

            case 2:
                with = sc.nextInt();
                if (with > cash) {
                    System.out.println("Your withdraw amount is greater than your balance");
                } else {
                    cash = cash - with;
                    System.out.println("After withdrawal balance: " + cash);
                }
                break;

            case 3:
                System.out.println("Your account balance: " + cash);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

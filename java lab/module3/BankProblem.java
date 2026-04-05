import java.util.Scanner;

// ============================================
//         BASE CLASS: BankAccount
// ============================================
class BankAccount {
    protected String ownerName;
    protected double balance;

    // Constructor
    public BankAccount(String name, double initialBalance) {
        this.ownerName = name;
        this.balance = initialBalance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            balance += amount;
            System.out.println("✅ Deposited: Rs." + amount);
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if(amount > balance) {
            System.out.println("❌ Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("✅ Withdrawn: Rs." + amount);
        }
    }

    // Display Balance
    public void displayBalance() {
        System.out.println("------------------------------");
        System.out.println("Account Holder : " + ownerName);
        System.out.println("Current Balance: Rs." + balance);
        System.out.println("------------------------------");
    }
}


// ============================================
//      CHILD CLASS 1: SavingsAccount
//   Rule: Balance cannot go below Rs.100
// ============================================
class SavingsAccount extends BankAccount {

    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if((balance - amount) < 100) {
            System.out.println("❌ Withdrawal denied!");
            System.out.println("   Minimum balance of Rs.100 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("✅ Withdrawn: Rs." + amount);
        }
    }
}


// ============================================
//      CHILD CLASS 2: CurrentAccount
//   Rule: Overdraft allowed up to Rs.5000
// ============================================
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String name, double initialBalance) {
        super(name, initialBalance);
        this.overdraftLimit = 5000;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if((balance - amount) < -overdraftLimit) {
            System.out.println("❌ Withdrawal denied!");
            System.out.println("   Overdraft limit of Rs.5000 exceeded.");
        } else {
            balance -= amount;
            System.out.println("✅ Withdrawn: Rs." + amount);
            if(balance < 0) {
                System.out.println("⚠️  Warning: Account is in overdraft!");
            }
        }
    }
}


// ============================================
//                MAIN CLASS
// ============================================
public class BankProblem {

    static Scanner sc = new Scanner(System.in);

    // ---- Menu for any account ----
    public static void showMenu(BankAccount account, String accountType) {
        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("   " + accountType + " - " + account.ownerName);
            System.out.println("========================================");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter deposit amount: Rs.");
                    double depositAmt = sc.nextDouble();
                    account.deposit(depositAmt);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: Rs.");
                    double withdrawAmt = sc.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while(choice != 4);
    }


    public static void main(String[] args) {

        // Create Accounts
        System.out.println("========================================");
        System.out.println("       WELCOME TO BANK SYSTEM          ");
        System.out.println("========================================");

        // Setup Savings Account
        System.out.print("Enter Savings Account Holder Name: ");
        String savName = sc.next();
        System.out.print("Enter Initial Balance for Savings Account: Rs.");
        double savBal = sc.nextDouble();
        SavingsAccount sa = new SavingsAccount(savName, savBal);

        // Setup Current Account
        System.out.print("\nEnter Current Account Holder Name: ");
        String curName = sc.next();
        System.out.print("Enter Initial Balance for Current Account: Rs.");
        double curBal = sc.nextDouble();
        CurrentAccount ca = new CurrentAccount(curName, curBal);

        // Main Menu
        int mainChoice;

        do {
            System.out.println("\n========================================");
            System.out.println("            MAIN MENU                  ");
            System.out.println("========================================");
            System.out.println("1. Savings Account  (" + savName + ")");
            System.out.println("2. Current Account  (" + curName + ")");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            mainChoice = sc.nextInt();

            switch(mainChoice) {
                case 1:
                    showMenu(sa, "SAVINGS ACCOUNT");
                    break;

                case 2:
                    showMenu(ca, "CURRENT ACCOUNT");
                    break;

                case 3:
                    System.out.println("\nThank you for using Bank System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while(mainChoice != 3);

        sc.close();
    }
}
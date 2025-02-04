public class BankAccount {
    public static void main(String[] args) {
        float balance = 2175.37f;
        System.out.println("Your current balance is $" + balance);
        balance -= 302.50f;
        System.out.println("Your current balance is $" + balance);
        balance += 50.03f;
        System.out.println("Your current balance is $" + balance);
        balance = balance / 2f + 20.00f;
        System.out.println("Your current balance is $" + balance);
        balance -= 1f;
        System.out.println("Your current balance is $" + balance);
        balance *= 2f;
        System.out.println("Your current balance is $" + balance);
        balance += 1f;

        System.out.println("Your current balance is $" + balance);
        System.out.println("Your current balance is $" + String.format("%.2f", balance)); //formats to decimal points only

    }
}


public class BankAccount {
    public static void main(String[] args) {
        float balance = 2175.37f;
        balance -= 302.50f;
        balance += 50.03f;
        balance = balance / 2f + 20.00f;
        balance -= 1f;
        balance *= 2f;
        balance += 1f;

        System.out.println("Your current balance is $" + String.format("%.2f", balance)); //formats to decimal points only

    }
}


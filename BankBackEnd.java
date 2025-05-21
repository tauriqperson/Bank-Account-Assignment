/*this is a Bank Account simulated program which allows you to open an account,
deposit funds, check balance and withdraw funds from the account while taking
exception handling into consideration.
*/
package BankBackEnd;

public class BankAccount {

    //Encapsulated Fields
    private double balance;
    private int accountNumber;

    //constructors for opening accounts
    public BankAccount(int accountNumber, double startBalance) {
        this.accountNumber = accountNumber;
        if (startBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative.");
        }
        this.balance = startBalance;
    }

    //deposit method with exception handling for depositing less than R1
    public String deposit(double depositAmount) {
        if (depositAmount <= 0) {
            throw new IllegalArgumentException("You cannot deposit less than R1");
        }
        balance += depositAmount;
        return "Successful deposit of R" + depositAmount;
    }

    //withdraw method with exception handling for withdrawing more than balance
    public double withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= withdrawAmount;
        return withdrawAmount;
    }

    //withdraw method overload with message
    public String withdraw(double withdrawAmount, String message) {
        withdraw(withdrawAmount);
        return "Withdrew R" + withdrawAmount + message;
    }

    //checkBalance method
    public void checkBalance() {
        System.out.println("Current Balance = R" + balance);
    }
}

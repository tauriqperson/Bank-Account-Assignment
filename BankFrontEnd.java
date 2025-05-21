import BankBackEnd.BankAccount;

public class BankFrontEnd {

    public static void main(String[] args) {

        //try catch exception handling to simulate front end of the bank account program

        try{
            BankAccount account = new BankAccount(12345, 0);
            account.checkBalance();

            System.out.println(account.deposit(500));
            System.out.println(account.withdraw(200, "\nTransaction successful\n"));

            //overdraft and exception handling test in comment below
            //System.out.println(account.withdraw(600));

            account.checkBalance();


        }catch (IllegalArgumentException e){
            System.err.println("Error: " + e.getMessage());
        }

    }

}

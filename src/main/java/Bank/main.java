package Bank;

public class main {
    public static void main(String[] args) {
        Bank account = new Bank(1000);
        account.printBankInfo();

        account.setDeposit(1500);
        System.out.println("New balance after deposit");
        account.printBankInfo();

        account.withdraw(200);
        System.out.println("amount available after withdrawal");
        account.printBankInfo();
    }
}

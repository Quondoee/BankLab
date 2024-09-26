package Bank;

public class Bank {

    private double Balance;

    public Bank(double initialBalance){
        if(initialBalance>= 0){
            this.Balance = initialBalance;

        } else {
            this.Balance = 0;

        }

    }
    public  double getBalance(){

        return this.Balance;
    }
    public void setDeposit(double newDeposit){
        if (newDeposit >=0){
            this.Balance = newDeposit;

        } else {

            System.out.println("Deposit cannot be negative");
        }

    }
    public void printBankInfo(){
        System.out.println("Account Balance: " + this.Balance);
    }
    public void withdraw(double amount){
        if(amount> 0 && amount<= this.Balance){
            this.Balance -= amount;
            System.out.println("Amount withdrawn:" + amount);

        }else {
            System.out.println("invalid withdrawal amount");


        }



    }


}

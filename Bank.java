public class Bank {

    private String nameOfDepositor;
    private int accountNumber;
    private String accountType;
    private double balanceInAccount;
    private double withdraw;

    public Bank(){
        nameOfDepositor = "Gurjot Singh";
        accountNumber = 12345;
        accountType = "Savings Account";
        balanceInAccount = 10000;
        withdraw = 500;
    }

    public String getnameOfDepositor(){
        return this.nameOfDepositor;
    }

    public int getaccountNumber(){
        return this.accountNumber;
    }

    public String getaccountType(){
        return this.accountType;
    }

    public double getbalanceInAccount(){
        return this.balanceInAccount;
    }

    public double withdraw(){
        return this.withdraw;
    }

    public String toString(){
        return "Bank: ---Name Of Depositor:- "+ this.nameOfDepositor +" ---Account No:- "+ this.accountNumber + " ---Account Type:- "+this.accountType +" ---Balance In Account:- "+this.balanceInAccount+ " ---Withdraw:- "+this.withdraw;

    }

    public void setnameOfDepositor(String nameOfDepositor){
        this.nameOfDepositor = nameOfDepositor;
    }

    public void setaccountNumber(){
        this.accountNumber = accountNumber;
    }

    public void setaccountType(){
        this.accountType = accountType;
    }

    public void setbalanceInAccount(){
        this.balanceInAccount = balanceInAccount;
    }

    public void setwithdraw(){
        this.withdraw = withdraw;
    }

    public static void main(String [] args){
        Bank b1 = new Bank();
        System.out.print(b1);
    }
        
}
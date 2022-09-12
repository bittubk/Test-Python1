public class Account implements DataCrud{

    private String customerName;
    private int accountNumber;
    private String accountType;

    public void create(){
        System.out.println("Account was created.");
    }

    public void retrieve(int id){
        System.out.println("Account was retrieved.");
    }

    public void retrieveAll(){
        System.out.println("Account was retrieved.");
    }

    public void update(int id){
        System.out.println("Account was updated.");
    }

    public void delete(int id){
        System.out.println("Account was deleted.");
    }

    public Account(String customerName, int accountNumber, String accountType){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public Account(String customerName, int accountNumber){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }

    public Account(String customerName){
        this.customerName = customerName;
    }

    public Account(){
        this("",1,"");
    }

    public String toString(){
        
        return "Account: ---Customer Name:- "+ this.customerName +" ---Account No:- "+ this.accountNumber + " ---Account Type:- "+this.accountType;
    }

    public static void main(String [] args){
        
        Account a1 = new Account();
        Account a2 = new Account("Gurjot Singh");
        Account a3 = new Account("Gurjot Singh",998524342);

        System.out.print(a1);
        System.out.print(a2);
        System.out.print(a3);

    }
}
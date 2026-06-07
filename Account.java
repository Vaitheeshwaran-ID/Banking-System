import java.util.ArrayList;

public class Account {
    String name;
    double balance;
    ArrayList<String>transactions=new ArrayList<>();

    public Account(String name,double balance){
        this.name=name;
        this.balance=balance;
        transactions.add("Account created with balance: "+balance);
    }

    public void deposit(double amount){
        balance+=amount;
        transactions.add("Amount deposited: "+amount);
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Amount not available in your account ");
        } else{
            balance-=amount;
            System.out.println("Amount withdrawed: "+amount);
            transactions.add("Amount withdrawed: "+amount);
        }
    }

    public void checkBalance(){
        System.out.println("current balance: "+balance);
    }

    public void showHistory(){
        for(int i=0;i<transactions.size();i++){
            System.out.println(transactions.get(i));
        }
    }

}


import java.util.*;
public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

Account a1=new Account("vaithee",0);


while(true){
    System.out.println("1. Deposit\n" +
            "2. Withdraw  \n" +
            "3. Check Balance\n" +
            "4. Show History\n" +
            "5. Exit");

    int a=sc.nextInt();

    if(a==5) break;


    switch(a){
        case 1:{
            System.out.println("Enter amount to deposit");
            int y=sc.nextInt();
            a1.deposit(y);
            break;

        }
        case(2):{
            System.out.println("Enter amount to withdraw");
            int y=sc.nextInt();
            a1.withdraw(y);
            break;
        }
        case(3):{
            a1.checkBalance();
            break;
        }
        case(4):{
            a1.showHistory();
            break;
        }
        default:{
            System.out.println("Not Valid\n"+"1. Deposit\n" +
                    "2. Withdraw  \n" +
                    "3. Check Balance\n" +
                    "4. Show History\n" +
                    "5. Exit");
        }
    }
}

    }
}

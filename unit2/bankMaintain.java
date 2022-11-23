package javaClassPrograms.unit2;

import java.util.Scanner;

class Account{
    int accountNumber;
    float accountBalance;
    int password;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}



public class bankMaintain {
    public static void main(String[] args) {
        Account account1,account2;
        account1 = new Account();
        account2 = new Account();

        account1.setAccountNumber(126);
        account1.setAccountBalance(456.0f);

        account2.setAccountNumber(189);
        account2.setAccountBalance(678.0f);

        System.out.println("Accounts available are");
        System.out.println(account1.getAccountNumber());
        System.out.println(account2.getAccountNumber());

        Scanner input=new Scanner(System.in);

        int choice = input.nextInt();
        if(choice == account1.getAccountNumber()){
            System.out.println(account1.getAccountBalance());
        }
        else if(choice == account2.getAccountNumber()){

            System.out.println(account2.getAccountBalance());
        }



















    }
}












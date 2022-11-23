package javaClassPrograms.unit2;
class Account1{
    int accountNumber;
    float accountBalance;
    int password;

    Account1(int accountNumber,float accountBalance){
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
    }
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
public class bankMaintainWithConstructor {
    public static void main(String[] args) {
        Account1 account1,account2;
        account1 = new Account1(123,345.0f);


    }
}

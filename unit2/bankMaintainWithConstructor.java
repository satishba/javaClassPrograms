import java.util.Scanner;

class Account1{
    int accountNumber;
    float accountBalance;
    int password;

    int accountStatement[] = new int [10];
    Account1(int accountNumber,float accountBalance){
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    void updateBalance(int value){
        this.accountBalance = this.accountBalance + value;

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
        int num=0;
        account1 = new Account1(123,345.0f);
        System.out.println("Do you want to witdraw or deposit");
        Scanner input = new Scanner(System.in);
        char choice=input.next().charAt(0);
        if(choice == 'y'){
            int password = input.nextInt();
            boolean verify=verifyPassword(account1,password);
            if(verify){
                int value = input.nextInt();
                account1.updateBalance(value);

                account1.accountStatement[num++]=value;
            }
            else {
                System.out.println("Invalid password");
            }
        }

    }
     public static boolean verifyPassword(Account1 acc, int givenPassword){
        boolean correctPassword;
        if(acc.password == givenPassword) {
            return true;
        }
        else
            return false;
    }
}

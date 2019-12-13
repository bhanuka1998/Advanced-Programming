package account;
// import java.io.*;
public class Account 
{
    long accnumber;
    String accholdername;
    double currentbalance;
    double interestrate;

    public static void main(String[] args)
    {
        Account acc1 = new Account();
        acc1.currentbalance = 100000;
        acc1.accnumber = 58942;
        acc1.accholdername = "Dean Winchester";
        acc1.deposite(10000);
        acc1.showBalance();
        acc1.withdraw(9000000);
        acc1.showBalance();

    }
    public void showBalance()
    {
        System.out.println("Account No. :"+accnumber);
        System.out.println("Account holder name: "+accholdername);
        System.out.println("Current Balance is: "+currentbalance);
    }
    public void deposite(double deposite)
    {
        currentbalance = currentbalance + deposite;
    }
    public void withdraw(double withdraw)
    {
        if (currentbalance>withdraw)
        {
            currentbalance = currentbalance - withdraw;
        }
        else
            System.out.println("Insufficient balance");
    }
}

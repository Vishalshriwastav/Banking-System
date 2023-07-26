import java.util.*;
public class Bank 
{
    private static Account[] ac=new Account[10];
    private static int accountCounter;

    public static Account getAccount()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number");
        long acn=sc.nextLong();
        for(int i=0;i<accountCounter;i++)
        {
            if(ac[i].getAccountNumber()==acn)
            {
                if(ac[i].checkPassword())
                {
                    return ac[i];
                }
                else
                {
                    System.out.println("Access denied to Account due to Wrong Password");
                    return null;
                }
            }
        }
        System.out.println("Account Not Found.");
        return null;
    }

    public static void openAccount()
    {
        Account a=new Account();
        a.openAccount();
        ac[accountCounter]=a;
        accountCounter++;
    }

    public static void depositMoney()
    {
        Account a=getAccount();
        if(a!=null)
        {
            a.greet();
            System.out.println("Enter amount of money you want to deposit?");
            Scanner sc=new Scanner(System.in);
            int money=sc.nextInt();
            a.deposit(money);
        }
    }

    private static void showDetails() 
    {
        Account a=getAccount();
        if(a!=null)
        {
            a.showDetails();
        }
    }

    private static void withdrawMoney() 
    {
        Account a=getAccount();
        if(a!=null)
        {
            a.greet();
            System.out.println("Enter amount of money you want to withdraw?");
            Scanner sc=new Scanner(System.in);
            int money=sc.nextInt();
            a.withdraw(money);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To The Bank.");
        Scanner sc=new Scanner(System.in);
        char ch='y';
        do{
            System.out.println("Enter 1 - Open Account");
            System.out.println("Enter 2 - Deposit Money");
            System.out.println("Enter 3 - Withdraw Money"); 
            System.out.println("Enter 4 - Show Details"); 
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    openAccount();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    showDetails();
                    break;
                default:
                    System.out.println("Wrong Option");
                    break;
            }
            System.out.println("Do you want to go again? [y-yes/n-no]");
            ch=sc.next().charAt(0);
        }while(ch!='n');
        System.out.println("Thank You For Visiting The Bank");   
    }
}
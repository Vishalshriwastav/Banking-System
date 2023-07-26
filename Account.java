import java.util.*;
public class Account 
{
    private long accountNumber;
    private String name;
    private String password;
    private int money;

    public void openAccount()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is Your Name?");
        name=sc.nextLine();
        System.out.println("Enter A password");
        password=sc.nextLine();
        System.out.println("What is your initial amount?");
        money=sc.nextInt();
        System.out.println("Your Account Is Created");
        accountNumber=(long) ((Math.random()*90000)+10000);
        System.out.println("Your Account Number is : AC"+accountNumber);
    }

    public void withdraw(int money)
    {
        if(this.money-money>=0)
        {
            this.money-=money;
            System.out.println("You withdrew Rs "+money);
            System.out.println("You currently have Rs "+this.money);
        }
        else
        {
            System.out.println("Please Enter a valid amount");
        }
    }

    public void deposit(int money)
    {
        this.money+=money;
        System.out.println("You deposited Rs "+money);
        System.out.println("You currently have Rs "+this.money);
    }

    public void showDetails()
    {
        System.out.println("Hello "+name);
        System.out.println("Your Account Number is : AC"+accountNumber);
        System.out.println("You have Rs "+money+" in Your Bank Account.");
    }

    public long getAccountNumber()
    {
        return accountNumber;
    }

    public boolean checkPassword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Account Password");
        String pass=sc.nextLine();
        return password.equals(pass);
    }

    public void greet()
    {
        System.out.println("Hello "+name);
    }
}
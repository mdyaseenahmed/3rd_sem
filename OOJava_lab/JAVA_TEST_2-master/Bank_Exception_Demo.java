/*******************************************************************************************
Implement user defined exception in a java program for Bank application which has a
class with instance variables acno, name, balance and methods like deposit(amt) and
withdraw(amt). If the balance falls below 2000/- then it should throw user defined 
exception “insufficient balance”.
********************************************************************************************/
import java.util.*;

class InsufficientException extends Exception
{
    String m;
    
    InsufficientException(String msg)
    {
        m = msg;
        System.out.println("Insufficient "+msg);
    }
}

class Bank
{
    String name;
    int accNo;
    double w_amt,d_amt;
    double bal = 2000;
    Scanner ip = new Scanner(System.in);
    void set_data()
    {
        System.out.print("Enter The Name : ");
        name = ip.nextLine();
        System.out.print("Enter The Account Number : ");
        accNo = ip.nextInt();
    }
    
    void withdrawl()
    {
        try
        {
            System.out.println("Enter The Amount To Be Withdrawal : ");
            w_amt = ip.nextDouble();
            if(w_amt>bal)
            {
                System.out.println("Your Account Does Not Have Sufficient balance To Fulfill The Request.");
            }
            else
            {
                bal -= w_amt;
                System.out.println("An Amount Of "+w_amt+" Has been Debited From Your Account.!");
            }
            if(bal<2000)
            {
                throw new InsufficientException("Balance!");
            }   
        }catch(InsufficientException e)
        {
            System.out.println(e);
        }
    }
    
    void deposit()
    {
        System.out.print("Enter The Amount To Be Deposited : ");
        d_amt = ip.nextDouble();
        bal += d_amt;
        System.out.println("An Amount Of "+d_amt+" Has Been Credited To Your Account.!");
    }
    
    void get_data()
    {
        System.out.println("-----------------------------------");
        System.out.println("Account Holder : "+name);
        System.out.println("Account Number : "+accNo);
        System.out.println("Available Balance : "+bal);
        System.out.println("-----------------------------------");
    }
    
    void Bal_Query()
    {
        System.out.println("-----------------------------------");
        System.out.println("Available Balance : "+bal);
        System.out.println("-----------------------------------");
    }
}

class Bank_Exception_Demo
{
    public static void main(String args[])    
    {
        Scanner ip = new Scanner(System.in);
        int ch;
        Bank b = new Bank();
        System.out.println("-----------------------------------");
        System.out.println("Enter The Details : ");
        System.out.println("-----------------------------------");
        b.set_data();
        do
        {
            System.out.println("-----------------------------------");
            System.out.println("The Choices Are : ");
            System.out.print("1.Deposit.\n2.Balance Query.\n3.Withdrawal.\n4.Account Details.\n5.Exit.\nEnter Your Choice : ");
            ch = ip.nextInt();
            
            switch(ch)
            {
                case 1 : b.deposit();
                         break;
                         
                case 2 : b.Bal_Query();
                         break;
                         
                case 3 : b.withdrawl();         
                         break;
                
                case 4 : b.get_data();
                         break;
                         
                case 5 : System.out.println("Thank You.!");         
                         System.exit(0);
                         break;
                         
                default : System.out.println("Invalid Choice.!");         
            }
        }while(ch!=5);
    }
}

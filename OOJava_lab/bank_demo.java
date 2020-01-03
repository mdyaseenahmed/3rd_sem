/******************************************************************************************************
	Develop a Java program to create a class Bank that maintains two kinds of account for its customers, one called savings account and the other current account. The savings account provides compound interest and withdrawal facilities but no cheque book facility. The current account provides cheque book facility but no interest. Current account holders should also maintain a minimum balance and if the balance falls below this level, a service charge is imposed.Create a class Account that stores customer name, account numbernd type of account. From this derive the classes Curr-acct and Savacct to make them more specific to their requirements. Include the necessary methods in order to achieve the following tasks:
	
	a) Accept deposit from customer and update the balance.
	b) Display the balance.
	c) Compute and deposit interest	
	d) Permit withdrawal and update the balance
	e) Check for the minimum balance, impose penalty if necessary and update the balance.
********************************************************************************************************/

import java.util.Scanner;
import java.io.*;
import java.lang.*;

class bank
{
	String name;
	int acc_no;
	int type;
	Scanner ip = new Scanner(System.in);
	void set_data(int n)
	{
		System.out.print("Enter Your Name : ");
		name = ip.next();
		System.out.print("Enter Your Account Number : ");
		acc_no = ip.nextInt();
		type = n;
	}

	void get_data()
	{
		System.out.println("Name Of Account Holder : "+name);
		System.out.println("Account Number : "+acc_no);
		if(type==1)
		System.out.println("Account Type : Saving ");
		if(type==2)
		System.out.println("Account Type : Current ");
	}
} 

class savings extends bank
{
	double bal = 0.0;
	int choice;
	int min_bal = 500;
	int ci,w_amt;
	double com_int;
	double dep_amt;
	Scanner ip = new Scanner(System.in);
    
    
    
	void deposit()
	{
	    System.out.println("-----------------------------------------------");
		System.out.print("Enter The Amount To Be Deposited : ");
		dep_amt = ip.nextDouble();
		bal += dep_amt;
		System.out.println("-----------------------------------------------");
		System.out.println("An Amount Of "+dep_amt+"/- Has Been Credited To Your Account");
		System.out.println("-----------------------------------------------");
	}	

	void display_bal()
	{
		if(bal==0.0)
		{
		    System.out.println("-----------------------------------------------");
		    System.out.println("There is No Amount in Your Account.");
		    System.out.println("-----------------------------------------------");
		}
		else if(bal<min_bal)
		{
		    System.out.println("-----------------------------------------------");
			System.out.println("Your Account Does Not Have Minimum Balance, Deposit Minimum Balance To Avoid Penalty.");
			bal -= 200;
			System.out.println("Available Balance : "+bal);
			System.out.println("-----------------------------------------------");
		}
		else
	    {
		    System.out.println("-----------------------------------------------");
			System.out.println("Available Balance : "+bal);
			System.out.println("-----------------------------------------------");
	    }
	}
	
	void withdrawal()
	{
	    System.out.println("-----------------------------------------------");
		System.out.print("Enter The Withdrawal Amount : ");
		w_amt = ip.nextInt();
		System.out.println("-----------------------------------------------");
		if(w_amt>bal)
		{
		    System.out.println("-----------------------------------------------");
			System.out.println("Your Account Does Not Sufficient Balance, to Fulfill The Request.");
			System.out.println("-----------------------------------------------");
		}
		else
		{
			bal -=w_amt;
			System.out.println("-----------------------------------------------");
			System.out.println("An Amount Of "+w_amt+"/- Has Been Debited From Your Account.");
			System.out.println("-----------------------------------------------");
		}	
	}
	
	void comp_intrst()
	{
	    System.out.println("-----------------------------------------------");
		System.out.print("Enter The Number Of Days : ");
	    double t = ip.nextDouble();
	    System.out.println("-----------------------------------------------");
 		System.out.print("Enter the rate at which the amount is to be compounded : ");
 		double r = ip.nextDouble();
 		System.out.println("-----------------------------------------------");
 		bal = bal*(Math.pow((1.0 + (r/100)),t));
 		System.out.println("-----------------------------------------------");
 		System.out.println("Amount after interest = "+bal);
 		System.out.println("-----------------------------------------------");
	}
    savings()
    {
	    do
	    {
	        System.out.println("-----------------------------------------------");
	        System.out.println("The Choices Are : ");
		    System.out.println("1. Deposit. \n2. Balance Query. \n3. Withdrawal. \n4. Compound Interest. \n5. Exit");
		    System.out.println("-----------------------------------------------");
		    System.out.print("Enter Your Choice : "); 
		    choice = ip.nextInt();
		    
		    switch(choice)
		    {
			    case 1 : deposit();
				    break; 

			    case 2 : display_bal();
				    break; 
	
			    case 3 : withdrawal();
    				break;

    			case 4 : comp_intrst(); 
    				break;
		
			    case 5 : System.out.println("Thank you..!");
				    System.exit(0);
				    break;

			    default : System.out.println("Invalid Choice..!");
		    }
	    }	while(choice!=5);
	}
}

class current extends bank
{
    double bal = 0.0;
	int choice;
	int min_bal = 1000;
	int ci,w_amt;
	double com_int;
	double dep_amt;
	Scanner ip = new Scanner(System.in);
    
	void deposit()
	{
	    System.out.println("-----------------------------------------------");
		System.out.print("Enter The Amount To Be Deposited : ");
		dep_amt = ip.nextDouble();
		bal += dep_amt;
		System.out.println("-----------------------------------------------");
		System.out.println("An Amount Of "+dep_amt+"/- Has Been Credited To Your Account");
		System.out.println("-----------------------------------------------");
	}	

	void display_bal()
	{
		if(bal==0.0)
		{
		    System.out.println("-----------------------------------------------");
		    System.out.println("There is No Amount in Your Account.");
		    System.out.println("-----------------------------------------------");
		}
		else if(bal<min_bal)
		{
		    System.out.println("-----------------------------------------------");
			System.out.println("Your Account Does Not Have Minimum Balance, Deposit Minimum Balance To Avoid Penalty.");
			bal -= 500;
			System.out.println("Available Balance : "+bal);
			System.out.println("-----------------------------------------------");
		}
		else
	    {
		    System.out.println("-----------------------------------------------");
			System.out.println("Available Balance : "+bal);
			System.out.println("-----------------------------------------------");
	    }
	}
	
	void withdrawal()
	{
	    System.out.println("-----------------------------------------------");
		System.out.print("Enter The Withdrawal Amount : ");
		w_amt = ip.nextInt();
		System.out.println("-----------------------------------------------");
		if(w_amt>bal)
		{
		    System.out.println("-----------------------------------------------");
			System.out.println("Your Account Does Not Sufficient Balance, to Fulfill The Request.");
			System.out.println("-----------------------------------------------");
		}
		else
		{
			bal -=w_amt;
			System.out.println("-----------------------------------------------");
			System.out.println("An Amount Of "+w_amt+"/- Has Been Debited From Your Account.");
			System.out.println("-----------------------------------------------");
		}	
	}    
	
	current()
	{
	   do
	    {
	        System.out.println("-----------------------------------------------");
	        System.out.println("The Choices Are : ");
		    System.out.println("1. Deposit. \n2. Balance Query. \n3. Withdrawal. \n4. To Issue Check Book.\n5. Exit");
		    System.out.println("-----------------------------------------------");
		    System.out.print("Enter Your Choice : "); 
		    choice = ip.nextInt();
		    
		    switch(choice)
		    {
			    case 1 : deposit();
				    break; 

			    case 2 : display_bal();
				    break; 
	
			    case 3 : withdrawal();
    				break;

    			case 4 : System.out.println("CheckBook We Delivered To Given Address."); 
    				break;
		
			    case 5 : System.out.println("Thank you..!");
				    System.exit(0);
				    break;

			    default : System.out.println("Invalid Choice..!");
		    }
	    }	while(choice!=5);
	}
}

class bank_demo
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter The Type Of Account : ");
		System.out.println("1. Savings Account. \n2. Current Account.");
		int type = inp.nextInt();
		bank b = new bank();
		b.set_data(type);
		

		switch(type)
		{
		    case 1 : System.out.println("-----------------------------------------------");
		             System.out.println("The Details Of Account Holder is As Follows : ");
		             System.out.println("-----------------------------------------------");
		             b.get_data();
		             savings s = new savings();
		             break;
		             
	        case 2 : System.out.println("-----------------------------------------------");
	                 System.out.println("The Details Of Account Holder is As Follows : ");	 
	                 System.out.println("-----------------------------------------------");
		             b.get_data();
		             current cb = new current();
		             break;
		             
            default : System.out.println("Invalid Account Type.!");		             
		}
	}
}
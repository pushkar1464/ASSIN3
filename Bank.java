/*All the banks operating in India are controlled by RBI. RBI has
set a well defined guideline (e.g. minimum interest rate,
minimum balance allowed, maximum withdrawal limit etc)
which all banks must follow. For example, suppose RBI has set
minimum interest rate applicable to a saving bank account to be
4% annually; however, banks are free to use 4% interest rate or to
set any rates above it.

Write a program to implement bank functionality in the above
scenario. Note: Create few classes namely Customer, Account,
RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc).
Assume and implement required member variables and functions
in each class.*/
//import java.util.*;

class Customer
{
	String Name;
	String address;
	int cellno;
	
	public Customer(String Name , String address , int cellno )
	{
		super();
		this.Name = Name;
		this.address = address;
		this.cellno = cellno;
		
	}
}

class Account
{
	int AccountNo;
	double balance;
	public Account(int AccountNo, double balance)
	{
		super();
		this.AccountNo = AccountNo;
		this.balance = balance;
	}
}


class RBI
{
	Customer customer;
	Account account;
	
	public RBI(Customer customer , Account account)
	{
		super();
		this.customer = customer;
		this.account = account;
	}
	
	public double WithdrawLimit()
	{
		return 10000;
	}
	public double IntrestRate()
	{
		return 5.0;
	}
}

class SBI extends RBI{
	SBI(Customer customer,Account account)
	
	{
		super(customer,account);
	}
	public String tostring()
	{
		return "SBI customer: " + customer.Name +"\n"+customer.address+customer.cellno+ account+"\n"+ account.AccountNo +"\n"+account.balance+ "\n WithdrawalLimit=" +WithdrawLimit()+
				"\n"+"InterestRate:" + IntrestRate();
	}
}

class HDFC extends RBI{
	HDFC(Customer customer,Account account)
	{
		super(customer,account);
	}
	public String tostring()
	{
		return "HDFC customer= " + customer.Name + "\n" +customer.address+customer.cellno+ account+"\n"+ account.AccountNo +"\n"+account.balance+ "\n WithdrawalLimit=" +WithdrawLimit()+
				"InterestRate:" + IntrestRate() + "]";
	}
}
class ICICI extends RBI{
	ICICI(Customer customer,Account account)
	{
		super(customer,account);
	}
	public String tostring()
	{
		return "ICICI customer= " + customer.Name + "\n" +customer.address+"\n"+customer.cellno+ account+"\n"+ account.AccountNo +"\n"+account.balance+ "\nWithdrawalLimit=" +WithdrawLimit()+
				"InterestRate:" + IntrestRate() + "]";
	}
}
public class Bank 
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer("push","Cdac",779815);
		Account a1 = new Account(1011,100000);
		
		SBI Ac = new SBI(c1,a1);
		System.out.println(Ac.tostring());
	}
}

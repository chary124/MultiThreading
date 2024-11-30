package com.chary.threadassignment;

class Customer
{
	public double balance = 2000;
	
	public synchronized void withDraw(int amount)  
	{
		if(amount > balance)
		{
			try
			{
				System.out.println("synchronized thread is in waiting mode ");
			wait();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("=====balance amount========");
		balance =  balance - amount;
		System.out.println("the balance amount is " + balance);
	}
	
	public synchronized void deposit(int amount )
	{
		this.balance = amount + this.balance;
		notify();
	}
}

public class Main {

	public static void main(String[] args) {
		Customer cus = new Customer();
		 Thread t1 = new Thread()
				 {
			public void run()
			{
				cus.withDraw(1000);
			}
				 };
				 t1.start();
				 
				 Thread t2 = new Thread()
						 {
					 public void run()
					 {
						 System.out.println("deposit thread started");
						 cus.deposit(5000);
					 }
						 };
				t2.start();
	}

}

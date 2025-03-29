package ATMProject;

import java.text.DecimalFormat;
import java.util.*;

public class Account {
	Scanner input=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	/* Set the customer number */
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	
	/* Get the customer number */
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	/* Set the pin number */
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	
	/* Get the pin number */
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	/*Get current account balance */
	
	public double getCurrentBalance() {
		return currentBalance;
	}
	
	/*Get saving account balance */
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	/* calculate current account withdrawal */
	
	public double calcCurrentWithdraw(double amount) {
		currentBalance=(currentBalance - amount);
		return currentBalance;
	}
	
	/* calculate saving account withdrawal */
	
	public double calcSavingWithdraw(double amount) {
		savingBalance=(savingBalance - amount);
		return savingBalance;
	}
	
	/*calculate current account deposit */
	
	public double calcCurrentDeposit(double amount) {
		currentBalance=(currentBalance + amount);
		return currentBalance;
	}
	
/*calculate saving account deposit */
	
	public double calcSavingDeposit(double amount) {
		savingBalance=(savingBalance + amount);
		return savingBalance;
	}
	
	/* Customer Current Account withdraw input */
	
	public void getCurrentWithdrawInput() {
		System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
		System.out.println("Amount you want to withdraw from Current Account: ");
		double amount=input.nextDouble();
		
		if((currentBalance - amount) >= 0) {
			calcCurrentWithdraw(amount);
			System.out.println("New Current Account Balance: " + moneyFormat.format(currentBalance));
		}
		else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	
	/* Customer Saving Account Withdraw Input */
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from Saving Account: ");
		double amount=input.nextDouble();
		
		if((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance: " + savingBalance + "\n");
		}
		else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
		
		
		/* Customer Current Account Deposit input */
		
		public void getCurrentDepositInput() {
			System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
			System.out.println("Amount you want to deposit from Current Account: ");
			double amount=input.nextDouble();
			
			if((currentBalance + amount) >= 0) {
				calcCurrentDeposit(amount);
				System.out.println("New Current Account Balance: " + moneyFormat.format(currentBalance));
			}
			else {
				System.out.println("Balance cannot be negative." + "\n");
			}
		}
			
			
			/* Customer Saving account deposit input */
			
			public void getSavingDepositInput() {
				System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
				System.out.println("Amount you want to withdraw from Saving Account: ");
				double amount=input.nextDouble();
				
				if((savingBalance + amount) >= 0) {
					calcSavingDeposit(amount);
					System.out.println("New Saving Account Balance: " + savingBalance + "\n");
				}
				else {
					System.out.println("Balance cannot be negative." + "\n");
				}
				
			}
			
			private int customerNumber;
			private int pinNumber;
			private double currentBalance=0;
			private double savingBalance=0;
		
}

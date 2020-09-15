package ATMPackage;

import java.text.DecimalFormat;
import java.util.*;

public class account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	//Set customerNumber
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	//Get customer Number
	public int getCustomerNumber() {
		return customerNumber;
		
	}
	
	//Set pin Number
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	//Get pin number
	public int getPinNumber() {
		return pinNumber;
	}
	
	//Get checking account balance
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	//Get saving account balance
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	//Calculate checking account withdrawal
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance -= amount;
		return checkingBalance;
	}
	
	//Calculate Saving Account Withdrawal
	public double calcSavingWithdraw(double amount) {
		savingBalance -= amount;
		return savingBalance;
	}
	
	//Calculate checking account deposit
	
		public double calcCheckingDeposit(double amount) {
			checkingBalance += amount;
			return checkingBalance;
		}
		
		//Calculate Saving Account Withdrawal
		public double calcSavingDeposit(double amount) {
			savingBalance += amount;
			return savingBalance;
		}
	
		//Customer Checking Account Withdraw Input
		
		public void getCheckingWithdrawInput() {
			System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
			System.out.print("Amount you want to withdraw from Checking Account: ");
			double amount = input.nextDouble();
			
			if((checkingBalance - amount) >= 0) {
				calcCheckingWithdraw(amount);
				System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
			} else {
				System.out.println("Balance cannot be negative." + "\n");
			}
		}
		
		
		//Customer Saving Account Withdraw Input
		
				public void getSavingWithdrawInput() {
					System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
					System.out.print("Amount you want to withdraw from Saving Account: ");
					double amount = input.nextDouble();
					
					if((savingBalance - amount) >= 0) {
						calcSavingWithdraw(amount);
						System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
					} else {
						System.out.println("Balance cannot be negative." + "\n");
					}
				}
				
		//Customer Saving Account Deposit Input
		
		public void getSavingDepositInput() {
			System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
			System.out.print("Amount you want to deposit to Saving Account: ");
			double amount = input.nextDouble();
			
			if((savingBalance + amount) >= 0) {
				calcSavingDeposit(amount);
				System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
			} else {
				System.out.println("Balance cannot be negative." + "\n");
			}
		}
		
		//Customer Checking Account Deposit Input
		
				public void getCheckingDepositInput() {
					System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
					System.out.print("Amount you want to deposit to Checking Account: ");
					double amount = input.nextDouble();
					
					if((checkingBalance + amount) >= 0) {
						calcCheckingDeposit(amount);
						System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
					} else {
						System.out.println("Balance cannot be negative." + "\n");
					}
				}
}

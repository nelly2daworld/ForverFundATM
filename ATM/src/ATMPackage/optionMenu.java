package ATMPackage;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class optionMenu extends account {
//	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	int selection; 
	//Validate login info customer number & pin number
	
	public void getLogin() throws IOException {
		int x = 1;
		
		do {
			try {
				data.put(1234, 5678);
				data.put(0000, 9999);
				
				System.out.println("=======> Welcome to the Forever Bank Fund <======= ");
				
				System.out.print("Enter your Customer Number: ");
				setCustomerNumber(input.nextInt());
				
				System.out.print("Enter your PIN Number: ");
				setPinNumber(input.nextInt());
			} catch (Exception e) {
				System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
				x = 2;
			}
			
			for(Entry<Integer, Integer> entry : data.entrySet()) {
				if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
//			System.out.println("\n" + "Wrong Customer Number or Pin Number: " + "\n");
		} while (x == 1);
	}
	
	//Display Account Type Menu w/ selection
	
	public void getAccountType() {
		System.out.println("Select Account you want to access");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.print("Choice: ");
		
		selection = input.nextInt();
		
		System.out.println();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
			
		case 2: 
			getSaving();
			break;
			
		case 3:
			System.out.println("Thanks for using this ATM!");
			break;
			
		default:
			System.out.println("\n" + "Invalid Choice" + "\n");
			getAccountType();
		}
	}
	
	//Display Checking Account Balance w/ selection
	
		public void getSaving() {
			System.out.println("Saving Account:");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Withdraw Funds");
			System.out.println("Type 3 - Deposit Funds");
			System.out.println("Type 4 - Exit");
			System.out.print("Choice: ");
			
			selection = input.nextInt();
			
			switch(selection) {
			case 1:
				System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()) + "\n");
				getAccountType();
				break;
				
			case 2: 
				getSavingWithdrawInput();
				getAccountType();
				break;
				
			case 3:
				getSavingDepositInput();
				getAccountType();
				break;
				
			case 4:
				System.out.println("Thanks for using this ATM");
				break;
				
			default:
				System.out.println("\n" + "Invalid Choice" + "\n");
				getSaving();
			}
		}
		
		
		public void getChecking() {
			System.out.println("Checking Account:");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Withdraw Funds");
			System.out.println("Type 3 - Deposit Funds");
			System.out.println("Type 4 - Exit");
			System.out.print("Choice: ");
			
			selection = input.nextInt();
			
			switch(selection) {
			case 1:
				System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()) + "\n");
				getAccountType();
				break;
				
			case 2: 
				getCheckingWithdrawInput();
				getAccountType();
				break;
				
			case 3:
				getCheckingDepositInput();
				getAccountType();
				break;
				
			case 4:
				System.out.println("Thanks for using this ATM");
				break;
				
			default:
				System.out.println("\n" + "Invalid Choice" + "\n");
				getChecking();
			}
		}
	
}

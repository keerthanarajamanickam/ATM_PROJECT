package ATMProject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;


public class OptionMenu extends Account{
	
	Scanner menuInput=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data=new HashMap<Integer, Integer>();
	
	/* VALIDATE LOGIN INFORMATION CUSTOMER NUMBER AND PIN NUMBER */
	
	public void getLogin() throws IOException {
		int x=1;
		
		do {
			try {
				
				data.put(9876543, 9876);
				data.put(8989898, 1890);
				
				System.out.println("Welcome to the ATM Project!..");
				
				System.out.println("Enter Your Customer Number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter Your Pin Number");
				setPinNumber(menuInput.nextInt());
				
				}catch(Exception e) {
					System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
					x=2;
				}
			        if (data.containsKey(getCustomerNumber()) && data.get(getCustomerNumber()).equals(getPinNumber())) {
			           getAccountType();
			        } else {
			           System.out.println("\nWrong Customer Number or Pin Number.\n");
			        }
		     x++;
		   }while(x ==1);
	}
	
	/* DISPLAY ACCOUNT TYPE MENU WITH SELECTION */
	
	public void getAccountType() {
		System.out.println();
		System.out.println("Select the account you want to access");
		System.out.println("Type 1 - Current Account");
		System.out.println("Type 2 - Savings Account");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice: ");
		
		selection =menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getCurrent();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thankyou for using this ATM, bye.");
			break;
			
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getAccountType();
		}
		
	}
	
	/* DISPLAY CURRENT ACCOUNT MENU WITH SELECTION */
	
	public void getCurrent() {
		System.out.println("Current Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice: ");
		
		selection=menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Current account Balance: " + moneyFormat.format(getCurrentBalance()));
			getAccountType();
			break;
			
		case 2:
			getCurrentWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCurrentDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thankyou for using this ATM, bye..");
			break;
			
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getCurrent();
			}
	}
	
	/* DISPLAY SAVINGS ACCOUNT MENU WITH SELECTION */
	
	public void getSaving() {
		System.out.println("Savings Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice: ");
		
		selection=menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Savings account Balance: " + moneyFormat.format(getSavingBalance()));
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
			System.out.println("Thankyou for using this ATM, bye..");
			break;
			
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getCurrent();
			}
	}
	int selection;

}

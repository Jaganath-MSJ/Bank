import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static List<UserDetails> users = new ArrayList<UserDetails>();

	public static void main(String[] args) {
		while(true) {
			System.out.println("\n1 - Regsiter");
			System.out.println("2 - Login");
			System.out.print("Enter the choice : ");
			int choice = sc.nextInt();
			
			if(choice==1) {
				System.out.print("Enter username : ");
				String username = sc.next();
				System.out.print("Enter email : ");
				String email = sc.next();
				System.out.print("Enter password : ");
				String password = sc.next();
				
				boolean check = true, pass = checkPassword(password);
				for(UserDetails user : users) {
					if(user.getUserName().equals(username) && user.getEmail().equals(email)) {
						System.out.println("username or password are already excit");
						check = false;
					}
				}
				
				if(check && pass) {
					UserDetails user = new UserDetails(username, email, password);
					users.add(user);
					System.out.print("If your have invite code y or n : ");
					if(sc.next().charAt(0)=='y') {
						System.out.print("Enter Invite Code : ");
						int inviteCode = sc.nextInt();
						for(UserDetails use : users) 
							if(use.getInviteCode()==inviteCode) use.addEarnings();
					}
					System.out.println("Account Registed");
				}
			}
			
			else if(choice==2) {
				System.out.print("Enter username : ");
				String username = sc.next();
				System.out.print("Enter email : ");
				String email = sc.next();
				System.out.print("Enter password : ");
				String password = sc.next();
				
				for(UserDetails user : users) {
					if(user.getUserName().equals(username) && user.getEmail().equals(email) && user.getPassword().equals(password)) {
						homeScreen(user);
						break;
					}
				}
			}
			
			else System.out.println("Enter valid choice");
		}
	}
	
	public static boolean checkPassword(String password) {
		if(password.length()<8) {
			System.out.println("Envalid password length");
			return false;
		}
		
		boolean upper = true, spical = true, number = true;
		int[] occur = new int[26];
		Arrays.fill(occur, 0);
		
		for(int i=0; i<password.length(); i++) {
			char ch = password.charAt(i);
			
			if(Character.isUpperCase(ch)) upper = false;
			if(Character.isLetter(ch)) number = false;
			if(!Character.isLetter(ch) && !Character.isDigit(ch)) spical = false;
			
			if(Character.isLetter(ch)) occur[Character.toLowerCase(ch)-97]++;
		}
		
		if(upper && spical && number) {
			System.out.println("Envalid password cast");
			return false;
		}
		
		for(int i=0; i<26; i++) {
			if(occur[i]>3) {
				System.out.println("Envalid password repeat");
				return false;
			}
		}
		
		return true;
	}
	
	public static void homeScreen(UserDetails user) {
		System.out.println("\nWelcome "+user.getUserName());
		while(true) {
			System.out.println("1 - Bank Account");
			System.out.println("2 - Payments");
			System.out.println("3 - Invite Code");
			System.out.println("4 - Transaction");
			System.out.println("5 - Display all Details");
			System.out.println("6 - Logout");
			System.out.print("Enter the choice : ");
			int choice = sc.nextInt();
			
			if(choice==1) bankAccount(user);
			else if(choice==2) payments(user);
			else if(choice==3) inviteCode(user);
			else if(choice==4) transaction(user);
			else if(choice==5) displayAllDetails(user);
			else if(choice==6) break;
			else System.out.println("Enter valid choice");
		}
	}
	
	public static void bankAccount(UserDetails user) {
		while(true) {
			System.out.println("\nBank Account");
			System.out.println("1 - Add Account");
			System.out.println("2 - Check Balance");
			System.out.println("3 - Add Amount");
			System.out.println("4 - Remove Account");
			System.out.println("5 - Go Back");
			System.out.print("Enter the choice : ");
			int choice = sc.nextInt();

			if(choice==1) {
				System.out.println("\nAdd Account");
				System.out.print("Enter Account Number : ");
				long accounNumber = sc.nextLong();
				System.out.print("Enter IFSC Number : ");
				String IFSC = sc.next();
				System.out.print("Enter Display name : ");
				String displayName = sc.next();
				System.out.print("Enter Bank name : ");
				String bankName = sc.next();
				System.out.print("Enter Balance : ");
				int balance = sc.nextInt();
				System.out.println("If you have UPI id y or n : ");
				String UPIid=null;
				if(sc.next().charAt(0)=='y') {
					System.out.print("Enter UPIid");
					UPIid = sc.next();
				}
				
				AccountDetails bank = new AccountDetails(accounNumber, IFSC, displayName, bankName, balance, UPIid);
				user.setBanks(bank);
				System.out.println("Account successfully added");
			}
			
			else if(choice==2) {
				System.out.println("\nCheck Balance");
				displayAccountDetails(user);
			}
			
			else if(choice==3) {
				System.out.println("\nAdd Amount");
				System.out.print("Enter Account Number : ");
				long accounNumber = sc.nextLong();
				System.out.print("Enter IFSC Number : ");
				String IFSC = sc.next();
				System.out.print("Enter Display name : ");
				String displayName = sc.next();
				System.out.print("Enter Amount to be Added :");
				int amount = sc.nextInt();
				
				for(AccountDetails bank : user.getBanks()) {
					if(bank.getAccountNumber()==accounNumber && bank.getIFSC().equals(IFSC) && bank.getDisplayName().equals(displayName)) {
						bank.addAmount(amount);
						System.out.println("Your balance : "+bank.getBalance());
					}
				}
				
			}
			
			else if(choice==4) {
				System.out.println("\nRemove Account");
				System.out.print("Enter Account Number : ");
				long accounNumber = sc.nextLong();
				System.out.print("Enter IFSC Number : ");
				String IFSC = sc.next();
				System.out.print("Enter Display name : ");
				String displayName = sc.next();
				
				boolean check = true;
				for(AccountDetails bank : user.getBanks()) {
					if(bank.getAccountNumber()==accounNumber && bank.getIFSC().equals(IFSC) && bank.getDisplayName().equals(displayName)) {
						user.removeAccount(bank);
						System.out.println("Account successfully removed");
						check = false;
					}
				}
				if(check) System.out.println("Account not Removed give correct details");
			}
			
			else if(choice==5) break;
			else System.out.println("Enter valid choice");
		}
	}
	
	public static void payments(UserDetails user) {
		while(true) {
			System.out.println("\nPayments");
			System.out.println("1 - UPI Payment");
			System.out.println("2 - Account Number Payment");
			System.out.println("3 - Go Back");
			System.out.print("Enter the choice : ");
			int choice = sc.nextInt();
			
			if(choice==1) {
				System.out.println("\nUPI payment");
				System.out.print("Enter UPI id : ");
				String UPIid = sc.next();
				System.out.print("Enter amount to be sended : ");
				int amount = sc.nextInt();
				
				boolean check = true;
				for(UserDetails use : users) {
					for(AccountDetails bank : use.getBanks()) {
						if(bank.getUPIid().equals(UPIid) && check) {
							for(AccountDetails ban : user.getBanks()) {
								if(ban.getBalance()>amount) {
									ban.subtractAmount(amount);
									TransactionHistory sender = new TransactionHistory(UPIid, bank.getDisplayName(), amount, "sended");
									user.setTransactions(sender);
									

									TransactionHistory reciver = new TransactionHistory(ban.getUPIid(), ban.getDisplayName(), amount, "sended");
									use.setTransactions(reciver);
									bank.addAmount(amount);
									
									System.out.println("Amount successfully payed");
									check = false;
									break;
								}	
							}
							
							if(check)System.out.println("Amount not payed balance not sufficient in your bank accounts");
							break;
						}
					}	
				}		
			}
			
			else if(choice==2) {
				System.out.println("\nAccount Number payment");
				System.out.print("Enter Account Number");
				long accounNumber = sc.nextLong();
				System.out.print("Enter IFSC Number");
				String IFSC = sc.next();
				System.out.print("Enter amount to be sended : ");
				int amount = sc.nextInt();
				
				boolean check = true;
				for(UserDetails use : users) {
					for(AccountDetails bank : use.getBanks()) {
						if(bank.getAccountNumber()==accounNumber && bank.getIFSC().equals(IFSC) && check) {
							for(AccountDetails ban : user.getBanks()) {
								if(ban.getBalance()>amount) {
									ban.subtractAmount(amount);
									TransactionHistory sender = new TransactionHistory(accounNumber, IFSC, bank.getDisplayName(), amount, "sended");
									user.setTransactions(sender);
									
									bank.addAmount(amount);
									TransactionHistory reciver = new TransactionHistory(ban.getAccountNumber(), ban.getIFSC(), ban.getDisplayName(), amount, "reciver");
									use.setTransactions(reciver);
									
									System.out.println("Amount successfully payed");
									check = false;
									break;
								}	
							}
							
							if(check) System.out.println("Amount not payed balance not sufficient in your bank accounts");
							break;
						}	
					}	
				}
			}
			
			else if(choice==3) break;
			else System.out.println("Enter valid choice");
		}
	}
	
	public static void inviteCode(UserDetails user) {
		while(true) {
			System.out.println("\nInvite Code");
			System.out.println("1 - Show Invite Code");
			System.out.println("2 - Show Earnings");
			System.out.println("3 - Go Back");
			System.out.print("Enter the choice : ");
			int choice = sc.nextInt();
			
			if(choice==1) System.out.println("\nYour Invite Code : "+user.getInviteCode());
			else if(choice==2) System.out.println("\nYour Earnings : "+user.getEarnings());
			else if(choice==3) break;
			else System.out.println("Enter valid choice");
		}
	}
	
	public static void transaction(UserDetails user) {
		while(true) {
			System.out.println("\nTransaction");
			System.out.println("1 - Last 7 days transaction history");
			System.out.println("2 - Last 15 days transaction history");
			System.out.println("3 - Last 30 days transaction history");
			System.out.println("4 - All transaction history");
			System.out.println("5 - Go Back");
			System.out.print("Enter the choice : ");
			int choice = sc.nextInt();
			
			if(choice==1) displayTransaction(user, 7);
			else if(choice==2) displayTransaction(user, 15);
			else if(choice==3) displayTransaction(user, 30);
			else if(choice==4) displayTransaction(user, 7);
			else if(choice==5) break;
			else System.out.println("Enter valid choice");
		}
	}
	
	public static void displayTransaction(UserDetails user, int x) {
		List<TransactionHistory> transactions = user.getTransactions();
		int n = transactions.size()-x;
		for(int i=n-1; i>=n; i--) {
			if(transactions.get(i).getUPIid()==null) {
				System.out.println("\nDate and Time : "+transactions.get(i).getDateTime());
				System.out.println("Display Name : "+transactions.get(i).getDisplayName());
				System.out.println("Account Number : "+transactions.get(i).getAccountNumber());
				System.out.println("IFSC : "+transactions.get(i).getIFSC());
				System.out.println("Amount : "+(transactions.get(i).getType().equals("sender") ?  "-" : "+")+transactions.get(i).getAmount());
			}
		}
	}
	
	public static void displayAllDetails(UserDetails user) {
		System.out.println("\nDisplay All Details");
		System.out.println("User Name : "+user.getUserName());
		System.out.println("Email : "+user.getEmail());
		System.out.println("Password : "+user.getPassword());
		System.out.println("Invite Code : "+user.getInviteCode());
		System.out.println("Earnings : "+user.getEarnings());
		displayAccountDetails(user);
	}
	
	public static void displayAccountDetails(UserDetails user) {
		int count=1;
		for(AccountDetails bank : user.getBanks()) {
			System.out.println("Your "+count+++" bank details");
			System.out.println("Account Number : "+bank.getAccountNumber());
			System.out.println("IFSC Number : "+bank.getIFSC());
			System.out.println("Display name : "+bank.getDisplayName());
			System.out.println("Bank name : "+bank.getDisplayName());
			System.out.println("UPIid : "+bank.getUPIid());
			System.out.println("Balance : "+bank.getBalance());
		}
	}
}

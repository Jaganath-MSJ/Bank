import java.util.ArrayList;
import java.util.List;

public class UserDetails {
	
	private String userName;
	private String email;
	private String password;
	private int inviteCode;
	List<AccountDetails> banks = new ArrayList<AccountDetails>();
	List<TransactionHistory> transactions = new ArrayList<TransactionHistory>();
	
	private int earnings=0;
	private static int inviteCodeCount = 111111;
	
	public UserDetails(String userName, String email, String password) {
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	
	public void removeAccount(AccountDetails bank) {
		banks.remove(bank);
	}
	
	public void addEarnings() {
		earnings += 50;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getInviteCode() {
		return inviteCode;
	}
	
	public List<AccountDetails> getBanks() {
		return banks;
	}
	
	public List<TransactionHistory> getTransactions() {
		return transactions;
	}
	
	public int getEarnings() {
		return earnings;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setInviteCode() {
		this.inviteCode = inviteCodeCount++;
	}
	
	public void setBanks(AccountDetails bank) {
		this.banks.add(bank);
	}
	
	public void setTransactions(TransactionHistory transaction) {
		transactions.add(transaction);
	}
	
	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}
	
}

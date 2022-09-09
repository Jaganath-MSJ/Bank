
public class AccountDetails {
	
	private long accountNumber;
	private String IFSC;
	private String displayName;
	private String bankName;
	private int balance;
	private String UPIid;
	
	public AccountDetails(long accountNumber, String IFSC, String displayName, String bankName, int balance, String UPIid) {
		this.accountNumber = accountNumber;
		this.IFSC = IFSC;
		this.displayName = displayName;
		this.bankName = bankName;
		this.balance = balance;
		
		if(UPIid==null) setUPIid();
		else this.UPIid = UPIid;
	}
	
	public void addAmount(int amount) {
		balance += amount;
	}
	
	public void subtractAmount(int amount) {
		balance -= amount;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getIFSC() {
		return IFSC;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getBankName() {
		return bankName;
	}

	public int getBalance() {
		return balance;
	}

	public String getUPIid() {
		return UPIid;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setUPIid() {
		UPIid = displayName+"@"+bankName;
	}
	
}

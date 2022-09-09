import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionHistory {
	
	private long accountNumber;
	private String IFSC;
	private String UPIid;
	private String displayName;
	private int amount;
	private String type;
	private String dateTime;
	
	public TransactionHistory(long accountNumber, String IFSC, String displayName, int amount, String type) {
		this.accountNumber = accountNumber;
		this.IFSC = IFSC;
		this.displayName = displayName;
		this.amount = amount;
		this.type = type;
		setDateTime();
	}
	
	public TransactionHistory(String UPIid, String displayName, int amount, String type) {
		this.UPIid = UPIid;
		this.displayName = displayName;
		this.amount = amount;
		this.type = type;
		setDateTime();
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getIFSC() {
		return IFSC;
	}

	public String getUPIid() {
		return UPIid;
	}

	public String getDisplayName() {
		return displayName;
	}

	public int getAmount() {
		return amount;
	}

	public String getType() {
		return type;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public void setUPIid(String uPIid) {
		UPIid = uPIid;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDateTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyt/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		dateTime = dtf.format(now);
	}
	
}

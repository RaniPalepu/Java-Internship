
public class BankAccount {
	float balance;
	long acntNo;
	String acntHolderName;
	public BankAccount(long acntno,float balance,String acntHoldername) {
		this.acntNo=acntno;
		this.balance=balance;
		this.acntHolderName=acntHoldername;
	}
	public void deposit(float amount) {
		balance =balance+amount;
	}
	public void withdraw(float amount) {
		balance =balance-amount;
	}
	public void showBalance() {
		System.out.println("balance:"+balance);
	}



}

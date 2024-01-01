package oop_01_01_24;

public class BackAccount {
	
	private String owner;
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	private double balance;

	public BackAccount() {
		this.owner = "noname";
	}

	public BackAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public static void main(String[] args) {
		BackAccount acc1 = new BackAccount();
		BackAccount acc2 = new BackAccount("Mang Ngo Thuc den day", 100);
		System.out.println(acc1.owner);
		System.out.println(acc2.owner);
	}
}

package com.Encapsulations;

public class First {

	
	private int Balance;
	private String account_name;
	static String bank_name="state bank of india";
	
	static {
		System.out.println("welcome to bank");
	}
	
	public String getaccount_name() {
		return account_name;
	}
	
	public void setaccount(String account_name) {
		this.account_name=account_name;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int Balance) {
		this.Balance=Balance;
	}
	public static void main(String[] args) {
	
		First f= new First();
		
		f.setBalance(1200);
		
		int a=f.getBalance();
		System.out.println(a );
		
		f.setaccount("payal");
		
		System.out.println(First.bank_name);
		System.out.println(f.getaccount_name());
	}

}

package com.practice;

public  class Practice1 {

	
		//==========================================encapsulation===================================================
	
		private String bank_holder;
        private int account_number;
        static String bank_name="state bank of india";
        
        static {
        	System.out.println("welcome to sbi bank..  i am glad to see you");
        }
        
        
    
        	public String getbank_holder() {
        		
        		return bank_holder;
        	}
        	
        	public void setbank_holder(String bank_holder) {
        		
        		this.bank_holder=bank_holder;
        	}
        	
        	public int getaccount_number() {
        		return account_number;
        }
        	
        	public void setaccount_number(int account_number){
        		this.account_number=account_number;
        	}
        	public static void main(String args[])
        	{
        		Practice1 pc=new Practice1();
        		
        		System.out.println(Practice1.bank_name);
        		
        		pc.setbank_holder("payal titirmare");
        		
        		System.out.println(pc.getbank_holder());
        		
        		pc.setaccount_number(12348);
        		System.out.println(pc.getaccount_number());
        	}
        	
        	
        	
	}



package com.Exception;
import java.io.InvalidClassException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;



public class ExceptionSbi {

	int atmpin;
	double amount,casharemaining;
	double bankBalance;
	int date,month,year;
	int hour,minute,seconds;
	String person_name;
	

	
	 public ExceptionSbi(int atmpin, double bankBalance, String person_name) {
		super();
		this.atmpin = atmpin;
		this.bankBalance = bankBalance;
		this.person_name = person_name;
	}

	static {
			System.out.println("welcome to ATM services");
		    }
 public void useAtm() {
		
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a pin");
	 int pin=sc.nextInt();
	  
	
 try {
	 
	 if(pin==atmpin)  {
		 System.out.println("Welcome to your account MR."+person_name);
	 }
	 else {
		 System.out.println("invalid pin is inserted");
		  throw new InvalidpinException();
	 }
	 System.out.println("enter amount to be withdraw");
	 double amount=sc.nextDouble();
	 if(amount<=bankBalance) {
		 casharemaining =bankBalance-amount;
		 System.out.println("your remaining balance will be"+casharemaining);
	 }
	 else {
		 System.out.println("Insufficient BAnk Balance");
		 throw new InsufficientBankBalance();
	 }
 }
	 
	 catch(InvalidpinException e1) {
		 e1.printStackTrace();
	 }
	 catch(InsufficientBankBalance e) {
		 e.printStackTrace();
	 }
	 catch (Exception e) {
		 e.printStackTrace();
	 }
	 finally {
		 
		 System.out.println("thanks for using SBI AT, services");
		 Calendar gc=new GregorianCalendar();
		 date=gc.get(GregorianCalendar.DATE);
		 month=gc.get(GregorianCalendar.MONTH);
		 year=gc.get(GregorianCalendar.YEAR);
			hour=gc.get(GregorianCalendar.HOUR);
			minute=gc.get(GregorianCalendar.MINUTE);
			seconds=gc.get(GregorianCalendar.SECOND);
			System.out.println(date+"/"+month+"/"+year);
			System.out.println(hour+":"+minute+":"+seconds);
			
	 }	 
	 
	 
 }
	
	public static void main(String[] args) {
		ExceptionSbi sbi=new ExceptionSbi(3030,35000,"Saurabh");
		sbi.useAtm();
		

	}
}

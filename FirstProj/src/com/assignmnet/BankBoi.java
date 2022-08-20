package com.assignmnet;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.Exception.InsufficientBankBalance;
import com.Exception.InvalidpinException;
public class BankBoi {
 
	int atmpin;
	double amount,cashremaing;
	double BankBalance;
	String Person_name;
	int date,month,year;
	int hour,minute,seconds;
	
	
	public BankBoi(int atmpin,String Person_name, int BankBalance) {
		this.atmpin=atmpin;
		this.Person_name=Person_name;
		this. BankBalance= BankBalance;
	}
		public  void useAtmMachine() {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the atmpin");
			int pin=sc.nextInt();
			try {

				if(pin==atmpin) {
					System.out.println("welcome to BOI miss."+Person_name);
					
				}
				else {
					System.out.println("Invalid pin is inserted");
					throw new InvalidpinException();
				}
				
				System.out.println("enter amount to be withdraw");
				double amount1=sc.nextDouble();
				
				if(amount1<=BankBalance) {
					cashremaing=BankBalance-amount1;
					System.out.println("your balance remaining"+cashremaing);
				}
				else {
					System.out.println("insufficient bank balance");
					throw new InsufficientBankBalance();
				}
				}
			catch(InvalidpinException e1) {
				e1.printStackTrace();
			}
			catch(InsufficientBankBalance e2) {
				e2.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	finally {
		System.out.println("Thanks for using SBI ATM Services");
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
	
	static {
		System.out.println("welcpme to bank of india");
	}
	public static void main(String[] args) {

		BankBoi bb=new BankBoi(3030,"payal",30000);
		bb.useAtmMachine();
	}

}

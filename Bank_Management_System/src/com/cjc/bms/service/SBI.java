package com.cjc.bms.service;
import java.util.Random;
import java.util.Scanner;
import com.cjc.bms.model.Account;


 
public class SBI {
Account a=new Account();
Scanner sc=new Scanner(System.in);
Random r=new Random();
public void createAc() {
	while(true) {
	System.out.println("Enter Your Account Number:");
	int ac=sc.nextInt();
	a.setAcno(ac);
	System.out.println("Enter Your name :");
	String name=sc.next()+sc.nextLine();
	a.setName(name);
	System.out.println("Enter Your Mobile Number :");
	long mob=sc.nextLong();
	a.setMob(mob);
	System.out.println("Enter Your Aadhar Number:");
	long adhar=sc.nextLong();
	a.setAdhar(adhar);
	System.out.println("Select Gender from Above:");
	char gen=sc.next().charAt(0);
	a.setGender(gen); 
	while(true) {
	System.out.println("Enter Your age:");
	int age=sc.nextInt();
	if(age>=18) {
		a.setAge(age);
	break;		
		}else {
			System.out.println("Your Age is Not Valid, Enter A Valid Age ");
		}
	}
	
	
	
int bal=0;
while(true) {
	System.out.println("Enter Balance :");
	int temp=sc.nextInt();
if(temp>=1000) {
	bal=temp;
	break;
}else {
	System.out.println("Minimum Amount to Start the Ac is 1000");
}
}
a.setBal(bal);
}
	
}
public void DisplayDetails() {
	System.out.println("Account Number : "+a.getAcno());
	System.out.println("Name is :"+a.getName());
	System.out.println("Mobile Number : "+a.getMob());
	System.out.println("Adhar Number : "+a.getAdhar());
	System.out.println("Age is : "+a.getAge());
	System.out.println("Balance : "+a.getBal());
}
public void deposit() {
	System.out.println("Enter Amount You want to deposit");
	int amt=sc.nextInt();
	int bal=a.getBal();
	int newbal=amt+bal;
	
	a.setBal(newbal);
	System.out.println("Your New Balance is"+a.getBal());
}
public int withdraw() {
	
	int bal=a.getBal();
	int newbal=0;
	while(true) {
	System.out.println("Enter Amount you want to withdraw: ");
	int amt=sc.nextInt();
	if(amt<=bal) {
		newbal=bal-amt;
		System.out.println("Your Amount is Debited and new Balance is"+newbal);
		break;
	}else{
		System.out.println("Please Check Balance ! ");
	}
}
	return newbal;
}
public void balCheck() {
	int acno=a.getAcno();
	System.out.println("Enter Account to check balance :");
	int ac=sc.nextInt();
	if(acno==ac) {     
		  System.out.println("Your Balnce is: "+a.getBal());  
	}else {
		System.out.println("Wrong Ac Number,Visit Bank to Know your Balance");
	}
}
public void kyc() {
	long adh=a.getAdhar();
	System.out.println("Enter Your Aadhar Card Number :");
	long adhh=sc.nextLong();
	if(adh==adhh) {
		System.out.println("Aadhar KYC Updated SuccessFully");
	}else {
		System.out.println("Wrong Aadhar Number , Visit to your Nearest CJC Bank");
	}
}
}

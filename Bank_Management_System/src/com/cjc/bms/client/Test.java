package com.cjc.bms.client;
import java.util.Scanner;
import com.cjc.bms.service.SBI;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SBI s=new SBI();
		while(true) {
		System.out.print("Welcome to CJC Bank.....Please Choose Option  \n"
				+ "1.Create Account \n"
				+ "2.Display Details \n"
				+ "3.Deposit Money \n"
				+ "4. Withdraw Money \n"
				+ "5. Check Balance \n"
				+ "6. KYC \n"
				+ "0. Exit");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			s.createAc();
			break;
		case 2:
			s.DisplayDetails();
			break;
		case 3:
			s.deposit();
			break;
		case 4:
			int bal=s.withdraw();
			System.out.println(bal);
			break;
		case 5:
			s.balCheck();
			break;
		case 6:
			s.kyc();
			break;
			default:
				System.out.println("Thankyou For Choosing CJC Bank");
				break;
		}
		if(ch==0) {
			break;
		}

	}
	}
}

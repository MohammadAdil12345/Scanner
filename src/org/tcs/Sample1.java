package org.tcs;

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the phone number");
		long phonenumber = scan.nextLong();
		System.out.println("your phone number is:"+phonenumber);
	   
		int phoneNumber = 0;
		if(phoneNumber>=10) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	   
	}

}

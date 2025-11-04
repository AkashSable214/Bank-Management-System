package com.controller;

import java.util.Scanner;

import com.model.Account;
import com.service.Rbi;
import com.serviceIMPL.Sbi;
import com.util.AccountFac;
import com.util.AccountType;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rbi bank = new Sbi();
		Account account = new Account();
		//AccountType type=AccountFac.getAccountType(null)

		boolean exit = false;

		System.out.println("******* Bank Management System *******");

		while (!exit) {
			System.out.println("\n1. Create Account");
			System.out.println("2. Existing User");
			//System.out.println(" AllCustomers");
			System.out.println("3. Exit");
			System.out.print("Select Option: ");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.print("Enter Account Number 5 digit: ");
				account.setAccNo(sc.nextLong());
				System.out.print("Enter Name: ");
				account.setName(sc.next());
				System.out.print("Enter Mobile No 4 digit: ");
				account.setMobNo(sc.nextLong());
				System.out.print("Enter Aadhar No 3 digit: ");
				account.setAadharNo(sc.next());
				System.out.print("Enter Gender: ");
				account.setGender(sc.next());
				System.out.print("Enter Age: ");
				account.setAge(sc.nextInt());
				System.out.print("Enter Initial Balance: ");
				account.setBalance(sc.nextDouble());
				
				System.out.println("Select Account type \n1. saving  \n2. current  \n3. Fixed");
				int inp=sc.nextInt();
				String str=null;
				if(inp==1) {
					str="saving";
				}else if(inp==2) {
					str="current";
				}else if(inp==3){
					str="fixed";
				}else {
					System.out.println("invlaid input");
				}
				
//				System.out.println(str);
				AccountType type=AccountFac.getAccountType(str);//savingObj
				account.setType(type);
				

				String account2 = bank.createAccount(account);
				System.out.println(account2);
				break;


			case 2:
				System.out.print("Enter your Account Number: ");
				int accNo = sc.nextInt();
				if (accNo == account.getAccNo()) {
					boolean back = false;
					while (!back) {
						System.out.println("\n1. Display Details");
						System.out.println("2. Deposit");
						System.out.println("3. Withdraw");
						System.out.println("4. Balance Check");
						System.out.println("5. Back");
						System.out.print("Select Option: ");
						int choice = sc.nextInt();

						switch (choice) {
						case 1:
							System.out.println(bank.displayCustomerAlldetails(account));
							break;
						case 2:
							System.out.print("Enter the amount to deposit: ");
							double amt = sc.nextDouble();

							double oldBalance = account.getBalance();
							double newBalance = bank.depositeMoney(account, amt);

							if (newBalance > oldBalance) {
							    System.out.println("Deposit successful. New balance: ₹" + newBalance);
							} else {
							    System.out.println("Deposit failed. Balance remains: ₹" + oldBalance);
							}
							break;
						case 3:
							System.out.print("Enter the amount to withdraw: ");
							double amount = sc.nextDouble();
							double wd = bank.withdrawal(account, amount); 
							System.out.println("Current Balance: ₹" + wd);
							break;
						case 4:
							double bc = bank.balancedCheck(account);
							System.out.println("Current balance: " + bc);
							break;
						case 5:
							back = true;
							break;
						default:
							System.out.println("Invalid option.");
						}
					}
				} else {
					System.out.println("Invalid Account Number!");
				}
				break;
				
//			case 3:
//				bank.all
//				break;

			case 3:
				System.out.println("Thank you for visiting!");
				exit = true;
				break;

			default:
				System.out.println("Invalid option.");
			}
		}

		sc.close();
	}
}

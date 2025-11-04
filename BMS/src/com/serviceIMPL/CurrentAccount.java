package com.serviceIMPL;

import com.exceptions.ExceptionCheck;
import com.exceptions.InvalidData;
import com.model.Account;
import com.repository.AccountRepository;
import com.repository.AccountRepositoryImpl;
import com.util.AccountType;

public class CurrentAccount implements AccountType {
	AccountRepository repo = new AccountRepositoryImpl();
	//@Override
//	public double depositMoney(Account account, double amt) {
//		try {
//			ExceptionCheck.checkDeposit(amt);
//			double updatedBalance = repo.depositeMoney(account, amt);
//			System.out.println("Deposit successful. New balance: ₹" + updatedBalance);
//			return updatedBalance;
//		} catch (InvalidData e) {
//			System.out.println("Transaction failed: " + e.getMessage());
//			return account.getBalance(); // return unchanged balance
//		} catch (Exception e) {
//			System.out.println("Unexpected error: " + e.getMessage());
//			return account.getBalance();
//		}
//		
//	}

	@Override
	public void withdrawMoney(double amt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance(long accNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void statementRequest(long accNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "CurrentAccount ";
	}

	@Override
	public void depositMoney(double amt) {
		// TODO Auto-generated method stub
		
	}

	
}

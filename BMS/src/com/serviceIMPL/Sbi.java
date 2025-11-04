package com.serviceIMPL;

import com.exceptions.ExceptionCheck;
import com.exceptions.InvalidData;
import com.model.Account;
import com.repository.AccountRepository;
import com.repository.AccountRepositoryImpl;
import com.service.Rbi;

public class Sbi implements Rbi {

	AccountRepository repo = new AccountRepositoryImpl();

	@Override
	public String createAccount(Account account) {
		try {
			ExceptionCheck.checkAccountNumber(account.getAccNo());
			ExceptionCheck.checkName(account.getName());
			ExceptionCheck.checkMobile(account.getMobNo());
			ExceptionCheck.checkAadhar(account.getAadharNo());
			ExceptionCheck.checkGender(account.getGender());
			ExceptionCheck.checkAge(account.getAge());
			ExceptionCheck.checkBalance(account.getBalance());
			return repo.createAccount(account);
		} catch (InvalidData e) {
			return "Error: " + e.getMessage();
		}

	}

	@Override
	public String displayCustomerAlldetails(Account account) {
		return repo.displayCustomerAlldetails(account);
	}

	@Override
	public double depositeMoney(Account account, double amt) {
		try {
			ExceptionCheck.checkDeposit(amt);
			double updatedBalance = repo.depositeMoney(account, amt);
			System.out.println("Deposit successful. New balance: ₹" + updatedBalance);
			return updatedBalance;
		} catch (InvalidData e) {
			System.out.println("Transaction failed: " + e.getMessage());
			return account.getBalance(); // return unchanged balance
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
			return account.getBalance();
		}
	}

	public double withdrawal(Account account, double amt) {
		try {
			ExceptionCheck.checkWithdraw(amt, account.getBalance());
			double newBalance = repo.withdrawal(account, amt);
			System.out.println("Withdrawal successful. New balance: ₹" + newBalance);
			return newBalance;
		} catch (InvalidData e) {
			System.out.println("Transaction failed: " + e.getMessage());
			return account.getBalance();
		} catch (Exception e) {

			System.out.println("Unexpected error occurred: " + e.getMessage());
			return account.getBalance();
		}
	}

	@Override
	public double balancedCheck(Account account) {
		return repo.balancedCheck(account);
	}

//	@Override
//	public void allCustomersData() {
//		repo.allCustomersData();
//		
//	}

//	@Override
//	public Account getAccountDetailsByAccountId(int accountNo) {
//		return repo.getAccountDetailsByAccountId(accountNo);
//	}
}

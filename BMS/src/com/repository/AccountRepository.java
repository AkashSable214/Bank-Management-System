
package com.repository;

import com.model.Account;

public interface AccountRepository {

	public String createAccount(Account acc);

	public String displayCustomerAlldetails(Account account);

	public double depositeMoney(Account account, double amount);

	public double withdrawal(Account account, double amount);

	public double balancedCheck(Account account);

	public Account getAccountDetailsByAccountId(int accountNo);
	
	//public void allCustomersData();
}


package com.service;

import com.model.Account;

public interface Rbi {

	public String createAccount(Account ac);

	public String displayCustomerAlldetails(Account account);

	public double depositeMoney(Account account,double ammount);

	public double withdrawal(Account account,double amt);

	public double balancedCheck(Account account);

	//public Account getAccountDetailsByAccountId(int accountNo);
//	public void allCustomersData();
}

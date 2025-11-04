package com.util;

import com.model.Account;

public interface AccountType {
	
	public void depositMoney( double amt);
	
	public void withdrawMoney(double amt);
	
	public void checkBalance(long accNo);
	
	public void statementRequest(long accNo);
	

}
/*


Deposit Money – Adding funds to your account via cash, cheque, or online transfer.

Withdraw Money – Taking out cash via ATM, cheque, or bank branch.

Check Balance – Viewing your current account balance.

Fund Transfer – Sending money to another account using NEFT, RTGS, IMPS, or UPI.

Cheque Services – Issuing, depositing, or stopping cheques.

ATM / Debit Card Services – Using debit cards for withdrawals, payments, or online transactions.

Internet / Mobile Banking – Managing your account online or through apps.

Interest Credit – Earning interest for savings or fixed deposits.

Statement Request – Getting account statements periodically.

Nomination / Update Details – Adding nominee or updating personal info.








*/
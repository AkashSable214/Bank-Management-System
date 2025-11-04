package com.util;

import com.serviceIMPL.CurrentAccount;
import com.serviceIMPL.FixedDepositAccount;
import com.serviceIMPL.SavingAccount;

public class AccountFac {
	
	public static AccountType getAccountType(String accType) {
			// SaviNg.equal
		if(accType.equalsIgnoreCase("saving")) {
			return new SavingAccount();
		}else if(accType.equalsIgnoreCase("current")) {
			return new CurrentAccount();
		}else if(accType.equalsIgnoreCase("fixed")) {
			return new FixedDepositAccount();// new FixedDepositAccount();
		}else {
			return null;
		}
	}

}

package com.repository;

import com.model.Account;

public class AccountRepositoryImpl implements AccountRepository {

    private Account a;

    @Override
    public String createAccount(Account acc) {
        this.a = acc;
        return "Account created successfully!";
    }

    @Override
    public String displayCustomerAlldetails(Account account) {
        if (a != null && a.getAccNo() == account.getAccNo()) {
            return "\n***** Account Details *****\n" +
                    "Account No: " + a.getAccNo() + "\n" +
                    "Name: " + a.getName() + "\n" +
                    "Mobile: " + a.getMobNo() + "\n" +
                    "Aadhar: " + a.getAadharNo() + "\n" +
                    "Gender: " + a.getGender() + "\n" +
                    "Age: " + a.getAge() + "\n" +
                    "Balance: " + a.getBalance() + "\n" +
                    "Account Type: " + a.getType() + "\n" +
                    "***************************\n";
        } else {
            return "No account found with that number.";
        }
    }

    @Override
    public double depositeMoney(Account account, double amount) {
        a.setBalance(a.getBalance() + amount);
        return a.getBalance();
    }

    @Override
    public double withdrawal(Account account, double amount) {
        a.setBalance(a.getBalance() - amount);
        return a.getBalance();
    }

    @Override
    public double balancedCheck(Account account) {
        return a.getBalance();
    }

    @Override
    public Account getAccountDetailsByAccountId(int accountNo) {
        if (a != null && a.getAccNo() == accountNo)
            return a;
        else
            throw new IllegalArgumentException("Invalid Account No");
    }
    
    
    
    

//	@Override
//	public void allCustomersData() {
//		if(a!= null)
//		
//	}
}

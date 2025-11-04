package com.exceptions;

public class ExceptionCheck {

	public static void checkAccountNumber(long accNo) {
		String accStr = String.valueOf(accNo);
		if (!accStr.matches("\\d{5,}")) {
			throw new InvalidData("Account number must be exactly 5 digits.");
		}

	}

	public static void checkName(String name) {
		if (name == null || !name.matches("^[A-Za-z ]{3,}$")) {
			throw new InvalidData("Name should contain only letters and be at least 3 characters long.");
		}
	}

	public static void checkMobile(long mobile) {
		String mobStr = String.valueOf(mobile);
		if (!mobStr.matches("^[1-9]\\d{3}$")) {// ^[6-9]\\d{9}$"
			throw new InvalidData("Mobile number must start with 1–9 and be 3 digits long.");
		}
	}

	public static void checkAadhar(String aadhar) {
		if (aadhar == null || !aadhar.matches("\\d{3}")) {
			throw new InvalidData("Aadhaar number must be exactly 3 digits.");
		}
	}

	public static void checkGender(String gender) {
		if (gender == null || !(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")
				|| gender.equalsIgnoreCase("Other"))) {
			throw new InvalidData("Gender must be Male, Female, or Other.");
		}
	}

	public static void checkAge(int age) {
		if (age < 18 || age > 100) {
			throw new InvalidData("Age must be between 18 and 100.");
		}
	}

	public static void checkBalance(double balance) {
		if (balance < 500) {
			throw new InvalidData("Minimum balance should be ₹500.");
		}
	}

	public static void checkDeposit(double amount) {
	    if (amount <= 0) {
	        throw new InvalidData("Deposit amount must be greater than zero.");
	    }
	}


	public static void checkWithdraw(double amount, double balance) {
		if (amount <= 0) {
			throw new InvalidData("Withdrawal amount must be greater than zero.");
		}
		if (amount > balance) {
			throw new InvalidData("Insufficient balance for withdrawal.");
		}
		if ((balance - amount) < 500) {
			throw new InvalidData("Minimum balance of ₹500 must be maintained.");
		}
	}

}

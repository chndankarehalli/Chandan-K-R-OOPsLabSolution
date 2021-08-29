package com.greatlearning.corejava.labsession;

import java.util.*;

class Employee {

	public String firstName;
	public String secondName;
	public String department;
	public String email;

	Employee(String a, String b) {
		firstName = a;
		secondName = b;
	}

	public String generateEmailAddress() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter the choice for department: \n 1 Technical \n 2 Admin \n 3 Human Resource \n 4 Legal \n");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			department = "technical";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "humanresource";
			break;
		case 4:
			department = "legal";
			break;
		default:
			System.out.println("Please enter valid option");
			generateEmailAddress();
		}
		email = firstName + secondName + "@" + department + ".greatlearning.com";
		return email;
	}

	public char[] generatePassword(int length) {

		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialCharacters = "!@#$";
		String combinedChars = upperCase + lowerCase + numbers + specialCharacters;

		Random rn = new Random();
		char[] password = new char[length];

		password[0] = lowerCase.charAt(rn.nextInt(lowerCase.length()));
		password[1] = upperCase.charAt(rn.nextInt(upperCase.length()));
		password[2] = specialCharacters.charAt(rn.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(rn.nextInt(numbers.length()));

		for (int i = 4; i < length; i++) {
			password[i] = combinedChars.charAt(rn.nextInt(combinedChars.length()));
		}
		return password;
	}

	public String showCredentials() {
		System.out.println("Dear " + firstName + " your generated credentials are shown below");
		return "Email--> " + email;
	}
}
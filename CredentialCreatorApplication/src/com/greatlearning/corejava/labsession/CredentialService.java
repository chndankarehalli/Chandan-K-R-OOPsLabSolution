package com.greatlearning.corejava.labsession;

import java.util.*;

public class CredentialService {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String fName = inp.next();
		System.out.println("Please enter your second name: ");
		String sName = inp.next();

		Employee obj = new Employee(fName, sName);

		obj.generateEmailAddress();
		System.out.println(obj.showCredentials());

		System.out.print("Password--> ");
		System.out.print(obj.generatePassword(8));
	}
}
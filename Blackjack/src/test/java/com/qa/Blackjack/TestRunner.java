package com.qa.Blackjack;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main (String[] args) {
		TestRunner.allTests();
	}
	
	public static void allTests() {
		Result result = JUnitCore.runClasses(ValidEntriesSuite.class, NonValidEntriesSuite.class);
		
		System.out.println("All results passed: " + result.wasSuccessful());
		
		if (!result.wasSuccessful()) {
			System.out.println("Failed Tests:");
			for (Failure fail : result.getFailures()) {
				System.out.println(fail.getMessage());
			}
		}
	}
}

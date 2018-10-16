package com.qa.Blackjack;

import static org.junit.Assert.*;

import org.junit.*;

public class BlackjackTest {

	Blackjack b = new Blackjack();
	static int count = 1;
	
		@BeforeClass
		public static void starto() {
			System.out.println("Welcome to my tests, I guess.");
			count = 1;
		}
		@Before
		public void setup() {
			System.out.println("Test " + count + "/2, commencing...");
		}
		@After
		public void teardown() {
			System.out.println("Test " + count + "/2, complete");
			count++;
		}
		@AfterClass
		public static void endo() {
			System.out.println("Testing complete.");
		}
		@Test
		public void test6() {
			assertEquals("2 valid entry: ",20,b.play(20,10));
		}
		@Test
		public void test7() {
			assertEquals("2 valid entry: ",20,b.play(10,20));
		}
}

package com.qa.Blackjack;

import static org.junit.Assert.*;

import org.junit.*;

public class BlackjackTestBust {

	Blackjack b = new Blackjack();
	static int count = 1;
	
		@BeforeClass
		public static void starto() {
			System.out.println("Welcome to my tests, I guess.");
			count = 1;
		}
		@Before
		public void setup() {
			System.out.println("Test " + count + "/3, commencing...");
		}
		@After
		public void teardown() {
			System.out.println("Test " + count + "/3, complete");
			count++;
		}
		@AfterClass
		public static void endo() {
			System.out.println("Testing complete.");
		}
		@Test
		public void test8() {
			assertEquals("1 valid entry, 1 bust entry: ",10,b.play(10,30));
		}
		@Test
		public void test11() {
			assertEquals("1 bust entry, 1 valid entry: ",10,b.play(30,10));
		}
		@Test
		public void test12() {
			assertEquals("2 bust entry: ",0,b.play(30,30));
		}
}

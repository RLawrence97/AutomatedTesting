package com.qa.Blackjack;

import static org.junit.Assert.*;

import org.junit.*;

public class BlackjackTestInvalid {

	Blackjack b = new Blackjack();
	static int count = 1;
	
		@BeforeClass
		public static void starto() {
			System.out.println("Welcome to my tests, I guess.");
			count = 1;
		}
		@Before
		public void setup() {
			System.out.println("Test " + count + "/12, commencing...");
		}
		@After
		public void teardown() {
			System.out.println("Test " + count + "/12, complete");
			count++;
		}
		@AfterClass
		public static void endo() {
			System.out.println("Testing complete.");
		}
		@Test
		public void test1() {
			assertEquals("2 negative entries: ",0,b.play(-10,-10));
		}
		@Test
		public void test2() {
			assertEquals("1 negative entry, 1 valid entry: ",0,b.play(-10,10));
		}
		@Test
		public void test3() {
			assertEquals("1 negative entry, 1 bust entry: ",0,b.play(-10,30));
		}
		@Test
		public void test4() {
			assertEquals("1 negative entry, 1 out of bounds: ",0,b.play(-10,50));
		}
		@Test
		public void test5() {
			assertEquals("1 negative entry, 1 valid entry: ",0,b.play(10,-10));
		}
		@Test
		public void test9() {
			assertEquals("1 valid entry, 1 out of bounds: ",0,b.play(10,50));
		}
		@Test
		public void test10() {
			assertEquals("1 negative entry, 1 bust entry:  ",0,b.play(30,-10));
		}
		@Test
		public void test13() {
			assertEquals("1 bust entry, 1 out of bounds: ",0,b.play(30,50));
		}
		@Test
		public void test14() {
			assertEquals("1 negative entry, 1 out of bounds: ",0,b.play(50,-10));
		}
		@Test
		public void test15() {
			assertEquals("1 out of bounds, 1 valid entry: ",0,b.play(50,10));
		}
		@Test
		public void test16() {
			assertEquals("1 out of bounds, 1 bust entry: ",0,b.play(50,30));
		}
		@Test
		public void test17() {
			assertEquals("2 out of bounds: ",0,b.play(50,50));
		}
}

package com.qa.Blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackjackTest2 {

	Blackjack b = new Blackjack();
		@Test
		public void test1() {
			assertEquals("2 negative entries: ",0,b.playTern(-10,-10));
		}
		@Test
		public void test2() {
			assertEquals("1 negative entry, 1 valid entry: ",0,b.playTern(-10,10));
		}
		@Test
		public void test3() {
			assertEquals("1 negative entry, 1 bust entry: ",0,b.playTern(-10,30));
		}
		@Test
		public void test4() {
			assertEquals("1 negative entry, 1 out of bounds: ",0,b.playTern(-10,50));
		}
		@Test
		public void test5() {
			assertEquals("1 negative entry, 1 valid entry: ",0,b.playTern(10,-10));
		}
		@Test
		public void test6() {
			assertEquals("2 valid entry: ",20,b.playTern(20,10));
		}
		@Test
		public void test7() {
			assertEquals("2 valid entry: ",20,b.playTern(10,20));
		}
		@Test
		public void test8() {
			assertEquals("1 valid entry, 1 bust entry: ",10,b.playTern(10,30));
		}
		@Test
		public void test9() {
			assertEquals("1 valid entry, 1 out of bounds: ",0,b.playTern(10,50));
		}
		@Test
		public void test10() {
			assertEquals("1 negative entry, 1 bust entry:  ",0,b.playTern(30,-10));
		}
		@Test
		public void test11() {
			assertEquals("1 bust entry, 1 valid entry: ",10,b.playTern(30,10));
		}
		@Test
		public void test12() {
			assertEquals("2 bust entry: ",0,b.playTern(30,30));
		}
		@Test
		public void test13() {
			assertEquals("1 bust entry, 1 out of bounds: ",0,b.playTern(30,50));
		}
		@Test
		public void test14() {
			assertEquals("1 negative entry, 1 out of bounds: ",0,b.playTern(50,-10));
		}
		@Test
		public void test15() {
			assertEquals("1 out of bounds, 1 valid entry: ",0,b.playTern(50,10));
		}
		@Test
		public void test16() {
			assertEquals("1 out of bounds, 1 bust entry: ",0,b.playTern(50,30));
		}
		@Test
		public void test17() {
			assertEquals("2 out of bounds: ",0,b.playTern(50,50));
		}
}

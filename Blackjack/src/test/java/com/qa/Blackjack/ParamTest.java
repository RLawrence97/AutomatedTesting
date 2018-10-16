package com.qa.Blackjack;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamTest {
	@Parameters
	public static Collection<Object[]>data(){
		return Arrays.asList(new Object[][] {{3,4,4},{1,9,9},{4,6,6},{-3,3,0},{25,16,16},{30,30,0},{-19,-6,0},{60,5,0}});
	}
	private int input1;
	private int input2;
	private int expected;
	Blackjack b = new Blackjack();
	public ParamTest(int incin1, int incin2, int inpect) {
		input1 = incin1;
		input2 = incin2;
		expected = inpect;
	}
	
	@Test
	public void test() {
		assertEquals(expected,b.playTern(input1,input2));
	}
}

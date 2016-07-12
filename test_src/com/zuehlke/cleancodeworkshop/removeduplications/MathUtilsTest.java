package com.zuehlke.cleancodeworkshop.removeduplications;

import com.zuehlke.cleancodeworkshop.removeduplication.MathUtils;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MathUtilsTest {

	@Test
	public void testIsDivisibleBy3_Given_FactorsOf_3() {
		assertTrue(MathUtils.isDivisibleBy(3, 3));
		assertTrue(MathUtils.isDivisibleBy(6, 3));
		assertTrue(MathUtils.isDivisibleBy(9, 3));
		assertTrue(MathUtils.isDivisibleBy(15, 3));
		assertTrue(MathUtils.isDivisibleBy(30, 3));
	}

	@Test
	public void testIsDivisibleBy3_Given_Negative_FactorsOf_3() {
		assertTrue(MathUtils.isDivisibleBy(-3, 3));
		assertTrue(MathUtils.isDivisibleBy(-6, 3));
		assertTrue(MathUtils.isDivisibleBy(-9, 3));
		assertTrue(MathUtils.isDivisibleBy(-15, 3));
		assertTrue(MathUtils.isDivisibleBy(-30, 3));
	}
	
	@Test
	public void testIsDivisibleBy3_Given_FailingInputs() {
		assertFalse(MathUtils.isDivisibleBy(2, 3));
		assertFalse(MathUtils.isDivisibleBy(4, 3));
		assertFalse(MathUtils.isDivisibleBy(10, 3));
	}

	@Test
	public void testIsDivisibleBy3_Given_SpecialInputs() {
		// 0 is dividable by every number
		assertTrue(MathUtils.isDivisibleBy(0, 3));
		// 1 isn't dividable by any number exept 1 itself
		assertFalse(MathUtils.isDivisibleBy(1, 3));
	}

	// ----------------------------------------------------------
	
	@Test
	public void testIsDivisibleBy5_FactorsOf_5() {
		assertTrue(MathUtils.isDivisibleBy(5, 5));
		assertTrue(MathUtils.isDivisibleBy(10, 5));
		assertTrue(MathUtils.isDivisibleBy(15, 5));
		assertTrue(MathUtils.isDivisibleBy(30, 5));
	}

	@Test
	public void testIsDivisibleBy5_Given_Negative_FactorsOf_5() {
		int number3 = -5;
		assertTrue(MathUtils.isDivisibleBy(number3, 5));
		int number2 = -10;
		assertTrue(MathUtils.isDivisibleBy(number2, 5));
		int number1 = -15;
		assertTrue(MathUtils.isDivisibleBy(number1, 5));
		int number = -30;
		assertTrue(MathUtils.isDivisibleBy(number, 5));
	}
	
	@Test
	public void testIsDivisibleBy5_Given_FailingInputs() {
		assertFalse(MathUtils.isDivisibleBy(4, 5));
		assertFalse(MathUtils.isDivisibleBy(6, 5));
	}

	@Test
	public void testIsDivisibleBy5_Given_SpecialInputs() {
		// 0 is dividable by every number
		assertTrue(MathUtils.isDivisibleBy(0, 5));
		// 1 isn't dividable by any number exept 1 itself
		assertFalse(MathUtils.isDivisibleBy(1, 5));
	}
}

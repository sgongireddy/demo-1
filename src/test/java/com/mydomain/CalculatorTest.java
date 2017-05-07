package com.mydomain;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Assert.assertEquals(8,new Calculator().add(3, 4));
	}
}

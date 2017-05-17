package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class multiplyTest {

	@Test
	public void testMultiply() {
		App test = new App();
		int result = test.multiply(3,4);
		assertEquals(12,result);
	}

}

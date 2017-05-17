package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class concateTest {

	@Test
	public void testConcatenate() {
		App test = new App();
		String result = test.concatenate("one","two");
		assertEquals("onetwo",result);
	}
}


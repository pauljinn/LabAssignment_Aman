package com.cg.testdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {
	Sample s = new Sample();

	@Test
	public void test_Calculate_Givenzero_Shouldreturnzero() {
		int result = s.calculate("0");
		assertEquals(0,result);
	}

}

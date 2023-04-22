package com.unit.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitTestDemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
//	@Disabled
	void testSum() {
		// Expected Result
		int expectedResult = 72;

		// Actual Result
		int actualResult = c.doSum(20, 50, 2);

		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	void testProduct() {
		// Expected Result
		int expectedResult = 30;
		
		// Actual Result
		int actualResult = c.doMultiply(5,6);
		
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	void testCompareNumbers() {
		
		// Actual Result
		Boolean actualResult = c.compareTwoNumber(5,5);
		
//		assertThat(actualResult).isFalse();
		assertThat(actualResult).isTrue();
	}

}

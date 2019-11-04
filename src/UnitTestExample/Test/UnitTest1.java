package UnitTestExample.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import UnitTestExample.ExampleClass;

/**
 * Unit tests example
 * @author jaubin
 *
 */
class UnitTest1 {
	/**
	 * Runs one time before all the tests
	 * @throws Exception Exception occurring while setting up
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// Code to run one time before all the tests
	}
	
	/**
	 * Runs one time after all tests have been run
	 * @throws Exception Exception occurring while tearing down
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		// Code to run one time after all tests have been run
	}
	
	/**
	 * Tests that 5 and 2 make 7
	 */
	@Test
	void addIntegers_5_2_returns_7() {
		// 1) Arrange
		int value1 = 5;
		int value2 = 2;
		int expected = 7;
		
		// 2) Act
		int actual = ExampleClass.addIntegers(value1, value2);
		
		// 3) Assert
		assertEquals(expected, actual);
	}
	
	/**
	 * Tests the "Hot" condition of getTemperatureLevel
	 */
	@Test
	void getTemperatureLevel_100_returns_hot() {
		// 1) Arrange
		int temperature = 100;
		String expected = "Hot";
		
		// 2) Act
		String actual = ExampleClass.getTemperatureLevel(temperature);
		
		// 3) Assert
		assertEquals(expected, actual);
	}
	
	/**
	 * Tests the "Pleasant" condition of getTemperatureLevel
	 */
	@Test
	void getTemperatureLevel_72_returns_pleasant() {
		// 1) Arrange
		int temperature = 72;
		String expected = "Pleasant";
		
		// 2) Act
		String actual = ExampleClass.getTemperatureLevel(temperature);
		
		// 3) Assert
		assertEquals(expected, actual);
	}
	
	/**
	 * Tests if a student passed if they had a grade of 80 and 2 absences
	 */
	@Test
	void didStudentPassClass_80_grade_2_absences_returns_true() {
		// 1) Arrange
		int grade = 80;
		int numAbsences = 2;
		
		// 2) Act
		boolean actual = ExampleClass.didStudentPassClass(grade, numAbsences);
		
		// 3) Assert
		assertTrue(actual);
	}
	
	/**
	 * Makes sure function doesn't postpend "[out of stock]" when not out of stock
	 */
	@Test
	void processItemName_6_quantity_does_not_return_outOfStock() {
		// 1) Arrange
		String itemName = "Widget";
		int quantity = 6;
		
		// 2) Act
		String actual = ExampleClass.processItemName(itemName, quantity);
		
		// 3) Assert
		assertEquals(itemName, actual);
	}
	
	/**
	 * Makes sure function postpends "[out of stock]" when out of stock
	 */
	@Test
	void processItemName_0_quantity_returns_outOfStock() {
		// 1) Arrange
		String itemName = "Widget";
		int quantity = 0;
		String expected = itemName + " [out of stock]";
		
		// 2) Act
		String actual = ExampleClass.processItemName(itemName, quantity);
		
		// 3) Assert
		assertEquals(expected, actual);
	}
}

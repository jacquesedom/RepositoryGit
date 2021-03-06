package edom.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaculatorTest {

	@Test
	void testAddTwoPositiveNumbers() {
		// Arrange
		int a = 2;
		int b = 3;
		Calculator calculator = new Calculator();

		// Act
		int somme = calculator.add(a, b);

		// Assert
		assertEquals(5, somme);
	}
	
	//Test pour la multiplication good
	@Test
	void testMultiplierNumbers() {
		// Arrange
		int a = 2;
		int b = 3;
		Calculator calculator = new Calculator();

		// Act
		int prod = calculator.mult(a, b);

		// Assert
		assertEquals(6, prod);
	}

}

package testing;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator calculator;
	
	@BeforeEach
	public void setUp() throws Exception {
		calculator = new Calculator();
	}
	
	@Test
	@DisplayName("Simple correct multiplication")
	public void testMultiply() {
		assertEquals(42, calculator.multiply(6, 7), "Simple multiplication works");
	}
	
	@Test
	@DisplayName("Increasing operation")
	public void testIncreasing() {
		int result = calculator.multiply(6, 7);
		assertAll("Multiplication Increases",
				() -> assertTrue(6 < result, () -> "all good"),
				() -> assertTrue(7 < result, () -> "all good"));
	}
	
	@Test
	@DisplayName("Failing test")
	public void testError() {
		assertEquals(false, true, "failure");
	}
	
	@Test
	@DisplayName("Error - Divide by 0")
	void whenDivideByZero_thenThrowsException(){
	    calculator.divide(10, 0);
	}
}

package de.schiemenz.stackcalc.junit;

import static org.junit.Assert.*;
import org.junit.*;
import de.schiemenz.stackcalc.Calculator;

@SuppressWarnings("static-access")
public class CalculatorTest {
	
	Calculator calculator = new Calculator();
	
	@Before
	public void init()
	{
		calculator.registerOperators();
	}

	@Test
	public void test()
	{
		calculator.processInput("12");
		calculator.processInput("1");
		calculator.processInput("3");
		calculator.processInput("+");
		calculator.processInput("-");
		calculator.processInput("sqrt");
		assertEquals(2.8284271, calculator.getTop(), 0.00001);
	}
}

package de.schiemenz.stackcalc.math;

import java.util.Stack;

public class StackDivision extends StackOperator {

	public StackDivision(){}

	@Override
	public Stack<Double> getResult(Stack<Double> stack) 
	{	
		double operandA = (Double)stack.pop();
		double operandB = (Double)stack.pop();
		
		if(operandA == 0.0d)
		{
			throw new ArithmeticException();
		}
		
		stack.push(operandB / operandA);
		
		return stack;
	}

	@Override
	public String toString()
	{
		return new String("/");
	}
}

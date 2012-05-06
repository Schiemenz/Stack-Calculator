package de.schiemenz.stackcalc.math;

import java.util.Stack;

public class StackSquareRoot extends StackOperator {

	public StackSquareRoot(){}

	@Override
	public Stack<Double> getResult(Stack<Double> stack) 
	{	
		double operandA = (Double)stack.pop();
		stack.push(Math.sqrt(operandA));
			
		return stack;
	}

	@Override
	public String toString()
	{
		return new String("sqrt");
	}
}

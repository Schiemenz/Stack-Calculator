package de.schiemenz.stackcalc.math;

import java.util.Stack;

public class StackSquare extends StackOperator {

	public StackSquare(){}

	@Override
	public Stack<Double> getResult(Stack<Double> stack) 
	{	
		double operand = (Double) stack.pop();
		stack.push(Math.pow(operand, 2.0d));
		
		return stack;
	}

	@Override
	public String toString()
	{
		return new String("^2");
	}
}

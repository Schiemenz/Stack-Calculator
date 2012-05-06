package de.schiemenz.stackcalc.math;

import java.util.Stack;

public class StackAddition extends StackOperator {

	public StackAddition(){}

	@Override
	public Stack<Double> getResult(Stack<Double> stack) 
	{	
		double operandA = (Double)stack.pop();
		double operandB = (Double)stack.pop();
		stack.push(operandA + operandB);
		
		return stack;
	}

	@Override
	public String toString()
	{
		return new String("+");
	}
}

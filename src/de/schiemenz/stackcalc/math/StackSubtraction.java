package de.schiemenz.stackcalc.math;

import java.util.Stack;

public class StackSubtraction extends StackOperator {

	public StackSubtraction(){}

	@Override
	public Stack<Double> getResult(Stack<Double> stack) 
	{	
		double operandA = (Double)stack.pop();
		double operandB = (Double)stack.pop();
		stack.push(operandB - operandA);
		
		return stack;
	}

	@Override
	public String toString()
	{
		return new String("-");
	}
}

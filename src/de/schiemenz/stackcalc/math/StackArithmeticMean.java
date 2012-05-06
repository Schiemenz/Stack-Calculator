package de.schiemenz.stackcalc.math;

import java.util.Stack;

public class StackArithmeticMean extends StackOperator {

	public StackArithmeticMean(){}

	@Override
	public Stack<Double> getResult(Stack<Double> stack) 
	{	
		int count = stack.pop().intValue();
		double sum = 0.0d;
		
		for(int i=0; i<count; i++)
		{
			sum += stack.pop();
		}	
		
		stack.push(sum / count);
		
		return stack;
	}

	@Override
	public String toString()
	{
		return new String("avg");
	}
}

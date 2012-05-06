package de.schiemenz.stackcalc.math;

import java.util.*;

/**
	Abstract class used for all the stack operators
*/
public abstract class StackOperator {
	
	public StackOperator(){};
	public abstract Stack<Double> getResult(Stack<Double> stack);
	public abstract String toString();
}

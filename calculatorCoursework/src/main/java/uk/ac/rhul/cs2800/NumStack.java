package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;


public class NumStack {
	private Stack numStack;

	public NumStack() {
		numStack = new Stack();
	}

	public void push(float i) {
		Entry number = new Entry(i);
		numStack.push(number);

	}

	public float numPop() {
		if (numStack.size == 0) {
			throw new EmptyStackException();
		}
		float result = numStack.pop().getValue();
		return result;
	}
	

	public boolean isEmpty() {
		if (numStack.size == 0) {
			return true;		
		}
		return false;
	}
}

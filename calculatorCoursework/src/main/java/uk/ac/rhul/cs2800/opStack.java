package uk.ac.rhul.cs2800;

//import java.util.EmptyStackException;

public class opStack {
	private Stack opStack;

	public opStack() {
		opStack = new Stack();
	}
	
	public boolean isEmpty() {
		if (opStack.size == 0) {
			return true;		
		}
		return false;
	}


}

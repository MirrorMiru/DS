package westview.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesterStack {

	@Test
	void test() {
		Stack<Integer> myStack = new Stack<Integer>();
		
		assert(myStack.size() == 0);//nothing added
		
		assert(myStack.pop() == null);//empty
		
		assert(myStack.peek() == null);//empty
		
	    myStack.push(9);
	    myStack.push(11);
	    
	    assert(myStack.size() == 2);
	    assert(myStack.peek() == 11);
	    
	    assert(myStack.pop() == 11);
	    assert(myStack.size() == 1);
	    assert(myStack.peek() == 9);
	}

}

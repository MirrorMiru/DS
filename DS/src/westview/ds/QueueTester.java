package westview.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTester {

	@Test
	void test() {
		Queue<Integer> myQ = new Queue<Integer>();
		
		assert(myQ.size() == 0);//nothing added
		
		assert(myQ.peek() == null);//empty
		
	    myQ.enqueue(9);
	    myQ.enqueue(11);
	    
	    assert(myQ.size() == 2);
	    assert(myQ.peek() == 9);
	    
	    myQ.dequeue();
	    assert(myQ.size() == 1);
	    assert(myQ.peek() == 11);
	}

}

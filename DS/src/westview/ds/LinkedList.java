package westview.ds;

import java.util.ArrayList;

public class LinkedList<T> {
	
	private int size;
	private Node head;
	


	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public void add(Node newN) {
		if(head == null) {
			head = newN;
		} else {
			LinkedList l = new LinkedList();
			l.add(newN);
		}
		size++;
	}
	
	public Node get(int index) {
	
			return null;
		
	}
	
	public int size() {
		return this.size;
	}

}

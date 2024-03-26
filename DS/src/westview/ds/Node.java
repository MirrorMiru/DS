package westview.ds;

public class Node<T> {
	
//A node has a next node reference
	private Node next;
	//A node stores data
	private T data;
	
	//constuctor that takes in data element
	public Node(T val) {
		this.data = val;
	}
	//getter for the data and next reference
	//called getnext and getdata

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

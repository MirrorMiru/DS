package westview.ds;

import java.util.ArrayList;

public class Queue<T> {
	//Implement storing the data using a 1D array
	private ArrayList<T> data;
	
	//add a constructor
	public Queue() {
		
		//instantiate the data list
		data = new ArrayList<T>();

	}

	public T peek() {
		if(data.size() > 0) {
			return data.get(0);
			}else {
				return null;
			}
	}
	
	public int size() {
		return data.size();
	}
	
	
	public void enqueue(T element) {
		data.add(element);
	}
	
	public void dequeue() {
		if(data.size() != 0) {data.remove(0);}
	}
	
}

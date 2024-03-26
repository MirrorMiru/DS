package westview.ds;

import java.util.ArrayList;

public class Stack<T> {
	//Implement storing the data using a 1D array
	private ArrayList<T> data;
	
	//add a constructor
	public Stack() {
		
		//instantiate the data list
		data = new ArrayList<T>();

	}
	//add a agetter called pop
	//that will remove the top from the stack
	//return null if empty
	public T pop() {
		if(data.size() > 0) {
		return data.remove(data.size()-1);
		}else {
			return null;
		}
	}
	
	//preview top of stack
	public T peek() {
		if(data.size() > 0) {
			return data.get(data.size()-1);
			}else {
				return null;
			}
	}
	
	public int size() {
		return data.size();
	}
	
	//add a setter called push
	//that will push to the top of the stack
	public void push(T element) {
		data.add(element);
	}
	
}

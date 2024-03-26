package westview.ds;

import java.util.ArrayList;

public class Queue2<T> {

	private Stack<T> data;
	private Stack<T> data2;
	
	//add a constructor
	public Queue2() {
		
		//instantiate the data list
		data = new Stack<T>();
		data2 = new Stack<T>();

	}
	

	
	
	public T peek() {
		if(data.size() > 0) {
			for(int i = data.size() - 1; i >= 0; i--) {
				data2.push(data.peek());
				data.pop();
				}
			
			T temp = data2.peek();
			
			for(int i = 0; i < data2.size(); i++) {
				data.push(data2.peek());
				data2.pop();
				}
			
			return data2.peek();
			}else {
				return null;
			}
	}
	
	public int size() {
		return data.size();
	}
	
	
	public void enqueue(T element) {
		data.push(element);
		for(int i = 0; i < data2.size(); i++) {
			data2.pop();
		}
	}
	
	public void dequeue() {
		if(data.size() != 0) {
		for(int i =0; i < data.size(); i++) {
			if(i == data.size() - 1) {
				data.pop();
			}else {
				data2.push(data.peek());
				data.pop();
			}
		}
		for(int i = 0; i < data2.size(); i++) {
			data.push(data2.peek());
			data2.pop();
		}
			
			}
	}
	
	public String toString() {
		String temp = "";
		if(data.size() != 0) {
			for(int i = 0; i < data.size(); i++) {
				data2.push(data.peek());
				data.pop();
			}
			for(int i = 0; i < data2.size(); i++) {
				temp += String.valueOf(data2.peek());
				if(i != data2.size() - 1) {
					temp+=" ";
				}
				data.push(data2.peek());
				data2.pop();
			}
		}
		return temp;
	}
	
}

package Bonus;

import java.io.PrintStream;

public class Stack<T> implements StackInterface<T> {
	private List<T> top;

	@Override
	public T top() throws Exception {

		if (isEmpty()) {
			throw new Exception();
		}
		return top.getValue();
	}

	// it cannot guarantee that the next element in the list is of the same
	// generic type. makes sense, it should be in this implementation though
	@SuppressWarnings("unchecked")
	@Override
	public void pop() {

		List<T> temp = this.top;
		this.top = this.top.getNext();
		temp.setNext(null);
	}

	@Override
	public void push(T c) {

		List<T> tempList = new List<T>(c);
		tempList.setNext(this.top);
		this.top = tempList;
	}

	@Override
	public boolean isEmpty() {

		return this.top == null;
	}

	@Override
	public void show(PrintStream p) {

		p.println(showHelper(this.top));
	}

	private String showHelper(List<T> l) {

		if (l == null) {
			return "";
		}
		return l.getValue() + " " + showHelper(l.getNext());
	}

}

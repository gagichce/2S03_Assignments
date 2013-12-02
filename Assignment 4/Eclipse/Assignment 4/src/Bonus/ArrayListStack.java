package Bonus;

import java.io.PrintStream;
import java.util.ArrayList;

public class ArrayListStack<T> implements StackInterface<T> {
	private ArrayList<T> stack;

	public ArrayListStack() {

		stack = new ArrayList<T>();
	}

	public ArrayListStack(T t) {

		stack = new ArrayList<T>();
		stack.add(t);
	}

	@Override
	public T top() throws ObjectIsEmpty {

		if (isEmpty())
			throw new ObjectIsEmpty("Stack is empty!");
		return stack.get(stack.size() - 1);
	}

	@Override
	public void pop() {

		if (!isEmpty()) {
			stack.remove(stack.size() - 1);
		}
	}

	@Override
	public void push(T c) {

		stack.add(c);
	}

	@Override
	public boolean isEmpty() {

		return stack.isEmpty();
	}

	@Override
	public void show(PrintStream p) {

		String myString = "";
		for (T myT : this.stack) {
			myString += myT + " ";
		}
		p.println(myString);
	}

	public void show(StringBuffer sb) {

		for (T myT : this.stack) {
			sb.append(" " + myT);
		}
		sb.reverse();
	}

}

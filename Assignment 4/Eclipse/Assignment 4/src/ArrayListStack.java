import java.util.*;

public class ArrayListStack {
	private ArrayList<Character> myArrayList;

	public ArrayListStack() {

		myArrayList = new ArrayList<Character>();
	}

	public ArrayListStack(char c) {

		myArrayList = new ArrayList<Character>(c);
	}

	public char top() throws Exception {

		if (isEmpty())
			throw new Exception();
		return myArrayList.get(myArrayList.size() - 1 );
	}

	public boolean isEmpty() {

		return myArrayList.size() == 0;
	}

	public void pop() {

		if (isEmpty())
			myArrayList.remove(myArrayList.size() - 1);
	}

	public void push(char c) {

		myArrayList.add(c);
	}
}

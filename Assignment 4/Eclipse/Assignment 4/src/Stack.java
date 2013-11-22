public class Stack {
	private List top;

	public Stack() {

		top = null;
	}

	public Stack(char c) {

		top = new List(c);
	}

	public char top() throws Exception {

		if (isEmpty())
			throw new Exception();
		return top.value;
	}

	public void pop() {

		if (!isEmpty())
			top = top.next;
	}

	public void push(char c) {

		top = new List(c, top);
	}

	public boolean isEmpty() {

		return top == null;
	}
}

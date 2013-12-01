import java.io.PrintStream;

public class Stack implements StackInterface {
	private List top;

	public Stack() {

		top = null;
	}

	public Stack(char c) {

		top = new List(c);
	}

	public char top() throws ObjectIsEmpty {

		if (isEmpty())
			throw new ObjectIsEmpty("Stack is empty!");
		return top.getValue();
	}

	public void pop() {

		if (!isEmpty())
			top = top.getNext();
	}

	public void push(char c) {

		top = new List(c, top);
	}

	public boolean isEmpty() {

		return top == null;
	}

	public void show(PrintStream p) {

		if (!isEmpty()) {
			List temp = this.top;
			do {
				p.print(temp.getValue() + " ");
				temp = temp.getNext();
			} while (temp.getNext() != null);
			p.println("");
		}
		else{
			p.println("Stack is empty");
		}
	}
	
	public void show(StringBuffer sb) {

		if (!isEmpty()) {
			List temp = this.top;
			do {
				sb.append(temp.getValue() + " ");
				temp = temp.getNext();
			} while (temp != null);
		}
		else{
			sb.append("Stack is empty");
		}
	}
}

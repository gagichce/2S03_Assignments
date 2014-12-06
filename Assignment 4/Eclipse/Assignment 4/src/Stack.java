import java.io.PrintStream;

public class Stack implements StackInterface {
	public List top;

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

	public void reverse(List current){

		//stack is empty
		if(current == null) return;

		//we have reached the end of the stack
		if (current.getNext() == null) {this.top = current; return;}

		reverse(current.getNext());
		current.getNext().setNext(current);
		current.setNext(null);
		return;
	}

	public static void main(String[] args){

		Stack myStack = new Stack('c');
		myStack.push('a');
		myStack.push('2');
		//myStack.reverse();
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

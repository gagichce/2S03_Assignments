import java.io.PrintStream;
import java.util.*;

public class ArrayListStack implements StackInterface{
	private ArrayList<Character> myArrayList;

	public ArrayListStack() {

		myArrayList = new ArrayList<Character>();
	}

	public ArrayListStack(char c) {

		myArrayList = new ArrayList<Character>(c);
	}

	public char top() throws ObjectIsEmpty {

		if (isEmpty())
			throw new ObjectIsEmpty("Stack is empty!");
		return myArrayList.get(myArrayList.size() - 1 );
	}

	public boolean isEmpty() {

		return myArrayList.size() == 0;
	}

	public void pop() {

		if (!isEmpty())
			myArrayList.remove(myArrayList.size() - 1);
	}

	public void push(char c) {

		myArrayList.add(c);
	}

	public void show(PrintStream p) {

		for(char myChar : myArrayList){
			p.print(myChar + " ");
		}
		p.println("");
	}
	
	public void show(StringBuffer sb){
		for(char myChar : myArrayList){
			sb.append(" " + myChar);
		}
		sb.reverse();
	}
}

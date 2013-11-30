package Bonus;

public class PList<T> {
	private int priority;
	private PList<T> next;
	private T c;

	public PList(int priority, T c) {

		this.priority = priority;
		this.c = c;
	}

	public PList(int priority, T c, PList<T> myList) {

		this.priority = priority;
		this.c = c;
		this.next = myList;
	}

	public T getValue() {

		return this.c;
	}

	public PList<T> getNext() {

		return this.next;
	}

	public void setNext(PList<T> next){
		this.next = next;
	}
	public int getPriority() {
		return this.priority;
	}
}


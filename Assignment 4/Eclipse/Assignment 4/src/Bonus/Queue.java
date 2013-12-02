package Bonus;

import java.io.PrintStream;

public class Queue<T> implements QueueInterface<T> {

	private SnocList<T> tail;

	public Queue() {

		this.tail = null;
	}

	@Override
	public T peek() throws ObjectIsEmpty {

		if (isEmpty()) {
			throw new ObjectIsEmpty("Queue was empty!");
		}
		return peekHelper(this.tail);
	}

	private T peekHelper(SnocList<T> l) {

		if (l.getNext() == null)
			return l.getValue();
		return peekHelper(l.getNext());
	}

	@Override
	public void dequeue() {

		if (!isEmpty()) {
			this.tail = dequeueHelper(this.tail);
		}

	}

	private SnocList<T> dequeueHelper(SnocList<T> sl) {

		if (sl.getNext() == null) {
			return null;
		}
		sl.setNext(dequeueHelper(sl.getNext()));
		return sl;
	}

	@Override
	public void enqueue(T c) {

		this.tail = new SnocList<T>(c, this.tail);
	}

	@Override
	public boolean isEmpty() {

		return this.tail == null;
	}

	@Override
	public void show(PrintStream p) {

		p.println(showHelper(this.tail));

	}
	
	public void show(StringBuffer sb) {

		sb.append(showHelper(this.tail));

	}

	private String showHelper(SnocList<T> l) {

		if (l == null)
			return "";
		return showHelper(l.getNext()) + l.getValue() + " ";
	}

}

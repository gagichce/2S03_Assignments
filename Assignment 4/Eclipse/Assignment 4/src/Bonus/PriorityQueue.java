package Bonus;

import java.io.PrintStream;

public class PriorityQueue<T extends Comparable<T>> implements PriQueue<T> {
	// turns out the end of the list doesn't really matter here
	// because it is never referenced, things are never really added to the tail
	// unless they belong there as this is a priority queue.
	private PList<T> head;

	public PriorityQueue() {

		this.head = null;
	}

	public PriorityQueue(int priority, T c) {

		this.head = new PList<T>(priority, c);
	}

	public T next() throws Exception {

		if (isEmpty())
			throw new Exception();
		return head.getValue();
	}

	public void deleteItem() {

		if (!isEmpty()) {
			PList<T> temp = this.head;
			this.head = this.head.getNext();
			// dereference just incase of mem leaks, not 100% sure if this is an
			// issue but just making sure
			temp.setNext(null);
		}
	}

	public void insertItem(int priority, T c) {

		PList<T> toAdd = new PList<T>(priority, c);
		// head case
		if (isEmpty()
				|| (priority > this.head.getPriority())
				|| (priority == this.head.getPriority() && (c
						.compareTo(this.head.getValue()) >= 0))) {
			toAdd.setNext(this.head);
			this.head = toAdd;
		} else
			insertSort(new PList<T>(priority, c), this.head);
	}

	// I do my sorting this way because it allows me to not
	// worry about the head case, where the head is replaced.
	// adding the max possible value to the top before sorting
	// and then removing it after is a dirty way of fixing this,
	// but it will always work.
	private void insertSort(PList<T> toAdd, PList<T> location) {

		if (location.getNext() == null) {
			location.setNext(toAdd);
		} else {
			if (toAdd.getPriority() > location.getNext().getPriority()) {
				toAdd.setNext(location.getNext());
				location.setNext(toAdd);
			} else if (toAdd.getPriority() == location.getNext().getPriority()) {
				if ((toAdd.getValue()).compareTo(location.getNext().getValue()) >= 0) {
					toAdd.setNext(location.getNext());
					location.setNext(toAdd);
				} else
					insertSort(toAdd, location.getNext());
			} else
				insertSort(toAdd, location.getNext());
		}
	}

	public boolean isEmpty() {

		return this.head == null;
	}

	public void show(PrintStream p) {

		if (!isEmpty()) {
			PList<T> stepper = this.head;
			do {
				p.println("Priority: " + stepper.getPriority() + " Value: "
						+ stepper.getValue());
				stepper = stepper.getNext();
			} while (stepper != null);
		} else
			p.println("Queue is empty");
	}
}
